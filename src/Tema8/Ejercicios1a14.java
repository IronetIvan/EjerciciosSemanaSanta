/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema8;

/**
 *
 * @author irone
 */
public class Ejercicios1a14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            // esCapicua

    if (Tema8.funciones.esCapicua(29)) {
      System.out.println("El 29 es capicúa");
    }

    if (Tema8.funciones.esCapicua(464)) {
      System.out.println("El 464 es capicúa");
    }

    // esPrimo 

    if (Tema8.funciones.esPrimo(29)) {
      System.out.println("El 29 es primo");
    }

    if (Tema8.funciones.esPrimo(80)) {
      System.out.println("El 80 es primo");
    }

    // siguientePrimo

    System.out.println("El siguiente primo mayor a 23 es " + Tema8.funciones.siguientePrimo(23));
    System.out.println("El siguiente primo mayor a 100 es " + Tema8.funciones.siguientePrimo(100));

    // potencia

    System.out.println("2^10 = " + Tema8.funciones.potencia(2, 10));
    System.out.println("5^(-3) = " + Tema8.funciones.potencia(5, -3));
    System.out.println("10^6 = " + Tema8.funciones.potencia(10, 6));

    // digitos

    System.out.println("El número 0 tiene " + Tema8.funciones.digitos(0) + " dígito/s.");
    System.out.println("El número 7 tiene " + Tema8.funciones.digitos(7) + " dígito/s.");
    System.out.println("El número 674893123 tiene " + Tema8.funciones.digitos(674893123) + " dígito/s.");

    // voltea

    System.out.println("El 5 volteado es " + Tema8.funciones.voltea(5));
    System.out.println("El 398004321 volteado es " + Tema8.funciones.voltea(398004321));
    System.out.println("El -75839 volteado es " + Tema8.funciones.voltea(-75839));

    // digitoN 

    System.out.println("En la posición 0 del 3452 está el " + Tema8.funciones.digitoN(3452, 0));
    System.out.println("En la posición 6 del 857964034 está el " + Tema8.funciones.digitoN(857964034, 6));
    System.out.println("En la posición 4 del 857964034 está el " + Tema8.funciones.digitoN(857964034, 4));

    // posicionDeDigito 

    System.out.println("En el 3452, el dígito 4 está en la posición " + Tema8.funciones.posicionDeDigito(3452, 4));
    System.out.println("En el 78604321, el dígito 1 está en la posición " + Tema8.funciones.posicionDeDigito(78604321, 1));
    System.out.println("En el 78604321, el dígito 7 está en la posición " + Tema8.funciones.posicionDeDigito(78604321, 7));
    System.out.println("En el 78604321, el dígito 5 está en la posición " + Tema8.funciones.posicionDeDigito(78604321, 5));

    // quitaPorDetras 

    System.out.println("Si al 78604321 se le quitan por detrás 4 dígitos, se queda como " + Tema8.funciones.quitaPorDetras(78604321, 4));
    System.out.println("Si al 1000 se le quita por detrás 1 dígito, se queda como " + Tema8.funciones.quitaPorDetras(1000, 1));

    // quitaPorDelante 

    System.out.println("Si al 78604321 se le quitan por delante 4 dígitos, se queda como " + Tema8.funciones.quitaPorDelante(78604321, 4));
    System.out.println("Si al 78604000 se le quitan por delante 2 dígitos, se queda como " + Tema8.funciones.quitaPorDelante(78604000, 2));

    // pegaPorDetras 

    System.out.println("Si al 567 se le pega por detrás el 1 da el " + Tema8.funciones.pegaPorDetras(567, 1));
    System.out.println("Si al 33 se le pega por detrás el 0 da el " + Tema8.funciones.pegaPorDetras(33, 0));

    // pegaPorDelante 

    System.out.println("Si al 567 se le pega por delate el 1 da el " + Tema8.funciones.pegaPorDelante(567, 1));
    System.out.println("Si al 33 se le pega por delante el 0 da el " + Tema8.funciones.pegaPorDelante(33, 0));

    // trozoDeNumero

    System.out.println("Al 78604000 le cojo el trozo que va de la posición 0 a la 3: " + Tema8.funciones.trozoDeNumero(78604000, 0, 3));
    System.out.println("Al 78604000 le cojo el trozo que va de la posición 4 a la 6: " + Tema8.funciones.trozoDeNumero(78604000, 4, 6));
    System.out.println("Al 78604000 le cojo el trozo que va de la posición 2 a la 2: " + Tema8.funciones.trozoDeNumero(78604000, 2, 2));

    // juntaNumeros

    System.out.println("Juntando el 21 y el 40 da el " + Tema8.funciones.juntaNumeros(21, 40));
    System.out.println("Juntando el 789 y el 250 da el " + Tema8.funciones.juntaNumeros(789, 250));

  }
}