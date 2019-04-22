/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema8;

import java.util.Scanner;

/**
 *
 * @author irone
 */
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long numero;
        String binario = "";

        System.out.println("Introduce un numero entero: ");
        numero = sc.nextLong();

        if (numero > 0) {
            while (numero > 0) {
                if (numero % 2 == 0) {
                    binario = "0" + binario;
                } else {
                    binario = "1" + binario;
                }
                numero = (int) numero / 2;
            }
        } else if (numero == 0) {
            binario = "0";
        } else {
            System.out.println("Numero erroneo");
        }

        System.out.println("La conversion a binario ha sido " + binario);
    }
}
