package com.ces2.trabajo1.modelo;

public class Concierto implements OrganizadorEvento {

    private Evento evento;

    public Concierto(Evento evento) {
        this.evento = evento;
    }

    @Override
    public String planificar() {
        return "Planificando el concierto '" + evento.getNombre() + "': se arma el escenario en "
                + evento.getLugar() + " para el " + evento.getFecha()
                + " con capacidad para " + evento.getNumeroInvitados() + " asistentes.";
    }

    @Override
    public String ejecutar() {
        return "Ejecutando el concierto '" + evento.getNombre() + "': sonido, luces y presentación "
                + "en " + evento.getLugar() + " con un presupuesto de $" + evento.getPresupuestoFormateado() + ".";
    }

    @Override
    public String cerrar() {
        return "Cerrando el concierto '" + evento.getNombre() + "': desmontaje del escenario en "
                + evento.getLugar() + " y balance final con " + evento.getNumeroInvitados() + " asistentes.";
    }

    public Evento getEvento() {
        return evento;
    }
}