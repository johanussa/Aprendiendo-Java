package domain.classes;

import java.util.Objects;

public class Persona {
    
    private String name;
    private int age;
    private double sueldo;
    
    public Persona(String name, int age, double sueldo) {
        this.name = name;
        this.age = age;
        this.sueldo = sueldo;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona: { ").append("Nombre: ").append(this.name);
        sb.append(", Edad: ").append(this.age);
        sb.append(", Sueldo: ").append(this.sueldo).append(" }");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.name);
        hash = 67 * hash + this.age;
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.sueldo) ^ 
            (Double.doubleToLongBits(this.sueldo) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        
        final Persona other = (Persona) obj;
        if (this.age != other.age) return false;
        if (Double.doubleToLongBits(this.sueldo) != Double.doubleToLongBits(other.sueldo)) {
            return false;
        }
        return Objects.equals(this.name, other.name);
    }
    
}
