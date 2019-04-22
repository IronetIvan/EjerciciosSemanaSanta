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
public abstract class Vehiculos {

   // atributos de clase
  private static int kilometrosTotales = 0;
  private static int vehiculosCreados = 0;
  
  // atributos de instancia
  private int kilometrosRecorridos;
  
  public Vehiculos() {
    this.kilometrosRecorridos = 0;
  }

  public int getKilometrosRecorridos() {
    return this.kilometrosRecorridos;
  }
  
  public static int getKilometrosTotales() {
    return Vehiculos.kilometrosTotales;
  }

  public void recorre(int k) {
    this.kilometrosRecorridos += k;
    Vehiculos.kilometrosTotales += k;
  }
}