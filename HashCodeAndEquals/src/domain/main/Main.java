package domain.main;

import domain.classes.Persona;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona("Johan", 28, 3500);
        Persona persona1 = new Persona("Laura", 24, 5000);
        Persona persona2 = new Persona("Laura", 24, 5000);
        
        System.out.println(persona.equals(persona1));
        System.out.println(persona.hashCode());
        System.out.println(persona1.equals(persona2));
        System.out.println(persona1.hashCode());
        System.out.println(persona2.hashCode());
        System.out.println(persona2.hashCode() == persona1.hashCode());
    }
}
