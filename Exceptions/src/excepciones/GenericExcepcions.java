package excepciones;

public class GenericExcepcions extends Exception {
    private String message;
    public GenericExcepcions(String message) {
        this.message = message;        
    }
    public String getMessage() {
        return this.message;
    }
}
