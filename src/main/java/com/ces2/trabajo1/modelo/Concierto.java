package com.ces2.trabajo1.modelo;

import java.util.List;
import java.util.stream.Collectors;

public class Concierto implements OrganizadorEvento {

    private String nombre;
    private List<Evento> eventos;

    public Concierto(String nombre, List<Evento> eventos) {
        this.nombre = nombre;
        this.eventos = eventos;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public List<Evento> getEventos() {
        return eventos;
    }

    @Override
    public String planificar() {
        if (eventos.isEmpty()) {
            return "Planificando el concierto '" + nombre + "': no hay eventos registrados.";
        }
        String listaEventos = eventos.stream()
                .map(Evento::getNombre)
                .collect(Collectors.joining(", "));
        return "Planificando el concierto '" + nombre + "': se preparan " + eventos.size() +
                " eventos (" + listaEventos + ").";
    }

    @Override
    public String ejecutar() {
        if (eventos.isEmpty()) {
            return "Ejecutando el concierto '" + nombre + "': no hay eventos para ejecutar.";
        }
        String listaEventos = eventos.stream()
                .map(e -> e.getNombre() + " en " + e.getLugar())
                .collect(Collectors.joining("; "));
        return "Ejecutando el concierto '" + nombre + "': " + listaEventos + ".";
    }

    @Override
    public String cerrar() {
        if (eventos.isEmpty()) {
            return "Cerrando el concierto '" + nombre + "': no hubo eventos que cerrar.";
        }
        String listaEventos = eventos.stream()
                .map(Evento::getNombre)
                .collect(Collectors.joining(", "));
        return "Cerrando el concierto '" + nombre + "': se finalizan " + eventos.size() +
                " eventos (" + listaEventos + ").";
    }
}
