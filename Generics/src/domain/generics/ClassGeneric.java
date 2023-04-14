package domain.generics;

public class ClassGeneric <T> {
    private T object;
    public ClassGeneric(T object) {
        this.object = object;
    }
    public void getClassGeneric() {
        System.out.println("Tipo: " + object.getClass().getSimpleName());
    }
    public T getObject() { return this.object; }
    public void setObject(T object) { this.object = object; }
}
