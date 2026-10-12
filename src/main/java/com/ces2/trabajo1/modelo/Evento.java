package com.ces2.trabajo1.modelo;

public class Evento {

    private String nombre;
    private String fecha;
    private String lugar;
    private int numeroInvitados;
    private double presupuesto;
    private Integer duracionHoras; // nuevo atributo

    public Evento(String nombre, String fecha, String lugar, int numeroInvitados, double presupuesto, Integer duracionHoras) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.lugar = lugar;
        this.numeroInvitados = numeroInvitados;
        this.presupuesto = presupuesto;
        this.duracionHoras = duracionHoras;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public int getNumeroInvitados() {
        return numeroInvitados;
    }

    public void setNumeroInvitados(int numeroInvitados) {
        this.numeroInvitados = numeroInvitados;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public Integer getDuracionHoras() {
        return duracionHoras;
    }

    public void setDuracionHoras(Integer duracionHoras) {
        this.duracionHoras = duracionHoras;
    }

    public String resumen() {
        return nombre + " (" + fecha + ", " + lugar + ")";
    }

    public String getPresupuestoFormateado() {
        return String.format("%,.0f", presupuesto);
    }
}
