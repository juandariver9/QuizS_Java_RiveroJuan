/*

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
   */
   package examen;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    
        int option;
    
        do {
            System.out.println("\nMenu Principal:");
            System.out.println("1. Información tarjetas listadas");
            System.out.println("2. Ver Información por mes");
            System.out.println("3. Guardar información de tarjetas ");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            option = scanner.nextInt();
            scanner.nextLine();  // Consumir nueva línea
    
            switch (option) {
                case 1 -> informacionTarjetas();
                case 2 -> informacionTarjetasMes();
                case 3 -> GuardarInformacionTarjetas();
                case 0 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción no válida.");
            }
        } while (option != 0);
    }


    public static void informacionTarjetas() {
        System.out.println("Info");
        
    }
    
    private static void informacionTarjetasMes() {
        int option;
        
        do {
            System.out.println("\nMeses del año:");
            System.out.println("1. Enero");
            System.out.println("2. Febrero");
            System.out.println("3. Marzo");
            System.out.println("4. Abril");
            System.out.println("5. Mayo");
            System.out.println("6. Junio");
            System.out.println("7. Julio");
            System.out.println("8. Agosto");
            System.out.println("9. Septiembre");
            System.out.println("10. Octubre");
            System.out.println("11. Noviembre");
            System.out.println("12. Diciembre");
            System.out.println("0. Salir");
            
            System.out.print("Seleccione una opción: ");
            option = scanner.nextInt();
            scanner.nextLine();  // Consumir nueva línea
    
            switch (option) {
                case 1 -> ;
                case 2 -> ;
                case 3 -> ;
                case 4 -> ;
                case 5 -> ;
                case 6 -> ;
                case 7 -> ;
                case 8 -> ;
                case 9 -> ;
                case 10 -> ; 
                case 11 -> ;
                case 12 -> ;
                case 0 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción no válida.");
            }
        } 
        while (option != 0);
    
    }
    
    private static void GuardarInformacionTarjetas() {
        System.out.println("Info");

    }

}





