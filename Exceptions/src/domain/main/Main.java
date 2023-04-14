package domain.main;

import excepciones.GenericExcepcions;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        double num1, num2, resp = 0.0;
        
        try {
            System.out.print("Ingrese el dividendo: ");
            num1 = scanner.nextDouble();
            System.out.print("Ingrese el divisor: ");
            num2 = scanner.nextDouble();
            resp = operation(num1, num2);            
        } catch (GenericExcepcions e) {
            System.out.println("Error: " + e);
        } finally {
            System.out.println("resp = " + resp);            
        }        
    }
    public static double operation(double num1, double num2) throws GenericExcepcions {
        if (num2 == 0.0) throw new GenericExcepcions("No se puede dividir entre 0");
        return num1 / num2;
    }
}
