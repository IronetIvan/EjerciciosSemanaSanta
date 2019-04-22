/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema9;

/**
 *
 * @author irone
 */
public class EjerciciosConcept_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Piloto nº 1
        PilotosF1 Piloto1F1 = new PilotosF1();
        Piloto1F1.setNombre("Fernando Alonso");
        Piloto1F1.setNacionalidad("España");
        Piloto1F1.setEdad(37);
        Piloto1F1.setCarreras(312);
        Piloto1F1.setCampeonatos(2);
        Piloto1F1.setPuntostemporada(99.94);

        //Piloto nº 2
        PilotosF1 Piloto2F1 = new PilotosF1();
        Piloto2F1.setNombre("Lewis Hamilton");
        Piloto2F1.setNacionalidad("Inglaterra");
        Piloto2F1.setEdad(34);
        Piloto2F1.setCarreras(232);
        Piloto2F1.setCampeonatos(5);
        Piloto2F1.setPuntostemporada(251.5);

        //Piloto nº 3
        PilotosF1 Piloto3F1 = new PilotosF1();
        Piloto3F1.setNombre("Sebastian Vettel");
        Piloto3F1.setNacionalidad("Alemania");
        Piloto3F1.setEdad(31);
        Piloto3F1.setCarreras(223);
        Piloto3F1.setCampeonatos(4);
        Piloto3F1.setPuntostemporada(228.75);

        System.out.println(Piloto1F1.Fernando_Alonso());
        System.out.println(Piloto2F1.Lewis_Hamilton());
        System.out.println(Piloto3F1.Sebastian_Vettel());
    }
}
