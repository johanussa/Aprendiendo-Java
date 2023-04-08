package domain;

import java.util.Scanner;

public class Main {
    
    private static char ficha1, ficha2;
    private static final char tableMap[][] = new char[3][3];
    private static final String players[] = new String[2];
    private static final Scanner scanner = new Scanner(System.in);
    private static int turno = 0;
    private static int jugadas = 0;
    
    public static void main(String[] args) {
               
        int optionFicha; 
        
        System.out.println("\t\nBienvenido al juego de Triki");
        System.out.print("> Ingrese nombre de jugador 1: ");
        players[0] = scanner.nextLine();
        System.out.print("> Ingrese nombre de jugador 2: ");
        players[1] = scanner.nextLine();
        
        do {            
            System.out.println("\n* Jugador " + players[0] + " Elija su Ficha: ");            
            System.out.println("1. X");
            System.out.println("2. O");
            System.out.println("3. Cancelar");
            System.out.print("\t\tOpcion: ");
            optionFicha = scanner.nextInt();
            switch (optionFicha) {
                case 1: ficha1 = 'X'; ficha2 = 'O'; break;
                case 2: ficha1 = 'O'; ficha2 = 'X'; break;
                case 3: System.out.println("\n\tFeliz día\n"); return;
                default:
                    System.out.print("\nLa opcion Ingresada " + optionFicha + " No es Valida, vuelva a intentarlo");
            }
        } while (optionFicha < 1 || optionFicha > 3);
        playPlayer();
    }
    public static void playPlayer() {
        
        boolean validateMov;
        int posFila, posColumn = 0; 
        showMap();
        
        if (jugadas == 8) {
            System.out.println("\n\t\tEsto es un Empate !!! ");
            System.out.println("\t\tNo Hay Ganador :(\n");
        } else {            
            System.out.println("\nTurno jugador " + players[turno]);
            do {            
                System.out.println("\tRecuerde, las posiciones deben estar entre fila y columna 1, a fila y columna 3");
                System.out.println("\t\tPor ejemplo fila '2' columna '3'");
                System.out.println("\n\t> Ingrese la posicion a marcar: ");
                System.out.print("Posicion de Fila: ");
                posFila = scanner.nextInt() - 1;
                validateMov = validatePos(posFila);
                if (validateMov) {
                    System.out.print("Posicion de la columna: ");
                    posColumn = scanner.nextInt() - 1;
                    validateMov = validatePos(posColumn);
                    if (validateMov) {
                        if (tableMap[posFila][posColumn] == 'X' || tableMap[posFila][posColumn] == 'X') {
                            System.out.println("\t\tLa posicion Ingresada ya fue asignada");
                            validateMov = false;
                        }
                    }
                }
            } while (!validateMov);
            tableMap[posFila][posColumn] = (turno == 1 ? ficha2 : ficha1);        
            validateWin();
        }
        
    }
    public static boolean validatePos(int pos) {
        if (pos >= 0 && pos < 3) return true;
        else {
            System.out.println("\n\t\tLa posicion ingresada No es valida, vuelva a intentar");
            return false;
        }
    }
    public static void showMap() {
        System.out.println("\t1   2   3");
        for (int i = 0; i < tableMap.length; i++) {
            System.out.print((i + 1) + "     | ");
            for (int j = 0; j < tableMap[i].length; j++) {
                System.out.print((tableMap[i][j] == 'X' || tableMap[i][j] == 'O' ? tableMap[i][j] : " ") + " | ");
            }
            System.out.println("\n      -------------");
        }
    }
    public static void validateWin() {
        char ficha = turno == 1 ? ficha2 : ficha1; 
        boolean win = false;
        if (tableMap[0][0] == ficha && tableMap[0][1] == ficha && tableMap[0][2] == ficha) win = true;
        else if (tableMap[1][0] == ficha && tableMap[1][1] == ficha && tableMap[1][2] == ficha) win = true;
        else if (tableMap[2][0] == ficha && tableMap[2][1] == ficha && tableMap[2][2] == ficha) win = true;
        else if (tableMap[0][0] == ficha && tableMap[1][1] == ficha && tableMap[2][2] == ficha) win = true;
        else if (tableMap[0][2] == ficha && tableMap[1][1] == ficha && tableMap[2][0] == ficha) win = true;
        else if (tableMap[0][0] == ficha && tableMap[1][0] == ficha && tableMap[2][0] == ficha) win = true;
        else if (tableMap[0][1] == ficha && tableMap[1][1] == ficha && tableMap[2][1] == ficha) win = true;
        else if (tableMap[0][2] == ficha && tableMap[1][2] == ficha && tableMap[2][1] == ficha) win = true;
        
        if (win) {
            showMap();
            System.out.println("\n\t\t\tFelicidades !!! ");
            System.out.println("\t\tEl Ganador del juego es: " + players[turno] + "\n");
        } else {
            turno = (turno == 0 ? 1 : 0);
            jugadas++;
            playPlayer();
        } 
    }
}
