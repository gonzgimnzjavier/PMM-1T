package com.example.ejercicio2b;

public class Pais {

    private int bandera;
    private String nombre;
    private int poblacion;
    private String capital;
    private String superficie;

    public Pais(int bandera, String nombre, int poblacion, String capital, String superficie){
        this.bandera = bandera;
        this.nombre = nombre;
        this.capital = capital;
        this.poblacion = poblacion;
        this.superficie = superficie;
    }

    public int getBandera(){
        return bandera;
    }
    public void setBandera(int bandera) {
        this.bandera = bandera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    public String getSuperficie() {
        return superficie;
    }

    public void setSuperficie(String superficie) {
        this.superficie = superficie;
    }
}
