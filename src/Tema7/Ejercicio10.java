/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema7;

/**
 *
 * @author irone
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] n = new int[20];
        int[] par = new int[20];
        int[] impar = new int[20];
        int i;
        int pares = 0;
        int impares = 0;

        for (i = 0; i < 20; i++) {
            n[i] = (int) (Math.random() * 101);

            if (n[i] % 2 == 0) {
                par[pares++] = n[i];
            } else {
                impar[impares++] = n[i];
            }
        }
        System.out.println("Array original:");
        for (i = 0; i < 20; i++) {
            System.out.print(n[i] + " ");
        }
        System.out.println();

        for (i = 0; i < pares; i++) {
            n[i] = par[i];
        }

        for (i = pares; i < 20; i++) {
            n[i] = impar[i - pares];
        }

        System.out.println("Array con los pares al principio:");
        for (i = 0; i < 20; i++) {
            System.out.print(n[i] + " ");
        }
    }
}
