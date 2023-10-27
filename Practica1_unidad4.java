/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica1_unidad4;

import java.util.Scanner;

/**
 *
 * @author Jacqueline Sarabia
 */
public class Practica1_unidad4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    double[]arreglos = {20.5, 40.6, 78.4, 94.7, 55.3, 22.6, 84.3};
    boolean salir= false;
    
    while (!salir){
        System.out.println("seleccione una opcion");
        System.out.println("1. sumar elementos");
        System.out.println("2. multiplicar elementos ");
        System.out.println("3. salir");
        int opcionseleccionada = scanner.nextInt();
        
        switch (opcionseleccionada){
            case 1:
            double suma = 0;
            {
                
                for(double elemento: arreglos){
                    suma += elemento;
                }   }
        System.out.println("la suma de los elementos es"+ suma);
        break;

        case 2:
            double multiplicacion = 1;
            {
                
                for(double elemento: arreglos){
                    multiplicacion *= elemento;
                }   }
        System.out.println("la multiplicacion de los elementos es"+ multiplicacion);
        break;

        case 3:
            salir=true;
            break;
        default:
            System.out.println("no valido seleccione de nuevo");
                 break;
                 
        }
        
    }
              scanner.close();  
    }
    
}
