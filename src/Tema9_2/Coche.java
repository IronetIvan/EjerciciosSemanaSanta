/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema9_2;

/**
 *
 * @author irone
 */
public class Coche extends Vehiculos {

    private int cilindrada;

    public Coche(int c) {
        super();
        this.cilindrada = c;
    }

    public void quemaRueda() {
        System.out.println("Bruuuuuuummmm");
    }
}
