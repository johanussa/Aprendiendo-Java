package prueba;

import enums.Continentes;

public class Main {
    public static void main(String[] args) {
        System.out.println("Continente = " + Continentes.AMERICA);
        System.out.println("No. Paises en el continente = " + Continentes.AMERICA.getPaises());
        System.out.println("No. Habitantes en el continente = " + Continentes.AMERICA.getHabts());
        Integer enteroInt = 10;
        int entero = enteroInt;
        System.out.println("entero = " + entero);
    }
}
