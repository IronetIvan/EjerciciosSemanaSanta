/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema7;

import java.util.Scanner;

/**
 *
 * @author irone
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[8];

        System.out.println("Introduce 8 numeros enteros y positivos: ");

        for (int i = 0; i < 8; i++) {
            num[i] = sc.nextInt();
        }

        for (int i = 0; i < 8; i++) {

            if (num[i] % 2 == 0) {
                System.out.println("El numero " + num[i] + " Par");
            } else {
                System.out.println("El numero " + num[i] + " Impar");
            }
        
    
}
    }
}
