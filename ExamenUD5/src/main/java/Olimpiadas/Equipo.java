package Olimpiadas;

import java.util.ArrayList;

public class Equipo {

    private String pais;
    private ArrayList<Deportista> listaDeportista;


    public Equipo(String pais){
        this.pais=pais;
    }


    public ArrayList<Deportista> getListaDeportista() {
        return listaDeportista;
    }

    public void setListaDeportista(ArrayList<Deportista> listaDeportista) {
        this.listaDeportista = listaDeportista;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }





}
