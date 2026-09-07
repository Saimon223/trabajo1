package com.ces2.trabajo1.modelo;

public class Boda implements OrganizadorEvento {

    private Evento evento;

    public Boda(Evento evento) {
        this.evento = evento;
    }

    @Override
    public String planificar() {
        return "Planificando la boda '" + evento.getNombre() + "': se reserva el salón en "
                + evento.getLugar() + " para el " + evento.getFecha()
                + " y se organiza el banquete para " + evento.getNumeroInvitados() + " invitados.";
    }

    @Override
    public String ejecutar() {
        return "Ejecutando la boda '" + evento.getNombre() + "': ceremonia, recepción y "
                + "banquete en " + evento.getLugar() + " con un presupuesto de $"
                + evento.getPresupuestoFormateado() + ".";
    }

    @Override
    public String cerrar() {
        return "Cerrando la boda '" + evento.getNombre() + "': se agradece a los "
                + evento.getNumeroInvitados() + " invitados y se entrega el salón en "
                + evento.getLugar() + ".";
    }

    public Evento getEvento() {
        return evento;
    }
}