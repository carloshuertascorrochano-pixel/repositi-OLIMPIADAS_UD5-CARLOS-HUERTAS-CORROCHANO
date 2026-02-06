package Olimpiadas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Deportista {
    Scanner entrada = new Scanner(System.in);


    private String nombre;
    private LocalDate fecha_nacimiento;
    private int medallas;
    private Equipo equipo;
    private ArrayList<String> listaModalidades;

    public Deportista(String nombre, int medallas, int fecha_nacimiento) {
        this.nombre = nombre;
        this.medallas = medallas;
        listaModalidades=new ArrayList<String>();

    }

    public ArrayList<String> verModalidades(){
        return listaModalidades;

    }

    public void inscribirse (String modalidad){
        listaModalidades.add(modalidad);
    }

    public LocalDate getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public int getMedallas() {
        return medallas;
    }

    public void setMedallas(int medallas) {
        this.medallas = medallas;
    }


    @Override
    public String toString() {

        System.out.println("paciente [nombre = " + nombre + " medallas " + medallas + " fecha nacimiento " + fecha_nacimiento + " ]");
        return "";


    }
}