package domain.persona;

public class Persona {
    
    private String name;
    private String lastName;
    private int age;
    
    public Persona() {}
    public Persona(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Persona { " + "Name: " + name + ", LastName: " + lastName + ", Age: " + this.age + " }";
    }
    public int getAge() { return this.age; }
}
