package com.silvia.optimapp.clases;

public class Usuarios {

    private String nombre;
    private int edad;
    private boolean estado;

    public Usuarios(String nombre, int edad, boolean estado) {
        this.nombre = nombre;
        this.edad = edad;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
