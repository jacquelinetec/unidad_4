/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareateams;

/**
 *
 * @author Jacqueline Sarabia
 */
public class Tareateams {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
char[][] arreglo = new char[3][5];

      
        char letra = 'a';
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                arreglo[i][j] = letra;
                letra++;
            }
        }

        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arreglo[i][j] + " ");
            }
            System.out.println(); 

        }
    }
}

    
    

