package com.ces2.trabajo1.modelo;

public class Conferencia implements OrganizadorEvento {

    private Evento evento;

    public Conferencia(Evento evento) {
        this.evento = evento;
    }

    @Override
    public String planificar() {
        return "Planificando la conferencia '" + evento.getNombre() + "': se reserva el auditorio en "
                + evento.getLugar() + " para el " + evento.getFecha()
                + " y se invita a " + evento.getNumeroInvitados() + " asistentes.";
    }

    @Override
    public String ejecutar() {
        return "Ejecutando la conferencia '" + evento.getNombre() + "': ponencias y talleres "
                + "en " + evento.getLugar() + " con un presupuesto de $" + evento.getPresupuestoFormateado() + ".";
    }

    @Override
    public String cerrar() {
        return "Cerrando la conferencia '" + evento.getNombre() + "': entrega de certificados a "
                + evento.getNumeroInvitados() + " asistentes y cierre del auditorio en "
                + evento.getLugar() + ".";
    }

    public Evento getEvento() {
        return evento;
    }
}