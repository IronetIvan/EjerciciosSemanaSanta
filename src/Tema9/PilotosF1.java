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
public class PilotosF1 {

    private String nombre;
    private String nacionalidad;
    private int edad;
    private int carreras;
    private int campeonatos;
    private double puntostemporada;

    public PilotosF1() {
    }

    public PilotosF1(String nombre, String nacionalidad, int edad, int carreras, int campeonatos, double puntostemporada) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.edad = edad;
        this.carreras = carreras;
        this.campeonatos = campeonatos;
        this.puntostemporada = puntostemporada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCarreras() {
        return carreras;
    }

    public void setCarreras(int carreras) {
        this.carreras = carreras;
    }

    public int getCampeonatos() {
        return campeonatos;
    }

    public void setCampeonatos(int campeonatos) {
        this.campeonatos = campeonatos;
    }

    public double getPuntostemporada() {
        return puntostemporada;
    }

    public void setPuntostemporada(double puntostemporada) {
        this.puntostemporada = puntostemporada;
    }

    public String Fernando_Alonso() {

        String Piloto1F1;
        Piloto1F1 = "Nombre: " + nombre + " Nacionalidad: " + nacionalidad + " Edad: " + edad + " Carreras en la F1: " + carreras + " Campeonatos de la F1:" + campeonatos + " Puntos por temporada en la F1: " + puntostemporada;
        return Piloto1F1;

    }

    public String Lewis_Hamilton() {

        String Piloto2F1;
        Piloto2F1 = "Nombre: " + nombre + " Nacionalidad: " + nacionalidad + " Edad: " + edad + " Carreras en la F1: " + carreras + " Campeonatos de la F1:" + campeonatos + " Puntos por temporada en la F1: " + puntostemporada;
        return Piloto2F1;

    }

    public String Sebastian_Vettel() {
        String Piloto3F1;
        Piloto3F1 = "Nombre: " + nombre + " Nacionalidad: " + nacionalidad + " Edad: " + edad + " Carreras en la F1: " + carreras + " Campeonatos de la F1:" + campeonatos + " Puntos por temporada en la F1: " + puntostemporada;
        return Piloto3F1;
    }
}