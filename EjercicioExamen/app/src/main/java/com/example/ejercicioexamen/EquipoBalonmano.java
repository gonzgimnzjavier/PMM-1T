package com.example.ejercicioexamen;

public class EquipoBalonmano {
    private String nombre;
    private String ciudad;
    private String pais;
    private int anioFundacion;
    private int imagenEscudo;

    public EquipoBalonmano(String nombre, String ciudad, String pais, int anioFundacion, int imagenEscudo) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.pais = pais;
        this.anioFundacion = anioFundacion;
        this.imagenEscudo = imagenEscudo;
    }


    public String getNombre() { return nombre; }
    public String getCiudad() { return ciudad; }
    public String getPais() { return pais; }
    public int getAnioFundacion() { return anioFundacion; }
    public int getImagenEscudo() { return imagenEscudo; }


    @Override
    public String toString() {
        return nombre + " - " + ciudad;
    }
}

