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
public class Bici extends Vehiculos {

    private int pinones;

    public Bici(int p) {
        super();
        this.pinones = p;
    }

    public void hazCaballito() {
        System.out.println("Estoy haciendo un caballito");
    }
}
