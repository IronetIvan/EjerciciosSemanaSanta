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
        Piloto2F1.setNombre("Felipe Massa");
        Piloto2F1.setNacionalidad("Brasileño");
        Piloto2F1.setEdad(37);
        Piloto2F1.setCarreras(272);
        Piloto2F1.setCampeonatos(0);
        Piloto2F1.setPuntostemporada(64.2);

        //Piloto nº 3
        PilotosF1 Piloto3F1 = new PilotosF1();
        Piloto3F1.setNombre("Kimi Raikonnen");
        Piloto3F1.setNacionalidad("Finlandes");
        Piloto3F1.setEdad(39);
        Piloto3F1.setCarreras(297);
        Piloto3F1.setCampeonatos(1);
        Piloto3F1.setPuntostemporada(87.5);

        System.out.println(Piloto1F1.Fernando_Alonso());
        System.out.println(Piloto2F1.Lewis_Hamilton());
        System.out.println(Piloto3F1.Sebastian_Vettel());
    }
}
