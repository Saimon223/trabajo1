package com.ces2.trabajo1.repositories;

import com.ces2.trabajo1.modelo.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OrganizadorRepository {

    public List<OrganizadorEvento> getOrganizadores() {
        List<OrganizadorEvento> organizadores = new ArrayList<>();

        // 4 Bodas
        organizadores.add(new Boda("Boda1", new ArrayList<>())); // 0 eventos
        organizadores.add(new Boda("Boda2", Arrays.asList(
                new Evento("Evento Boda2-1", "2026-10-12", "Medellín", 100, 5000, 5)
        ))); // 1 evento
        organizadores.add(new Boda("Boda3", Arrays.asList(
                new Evento("Evento Boda3-1", "2026-11-01", "Bogotá", 200, 10000, 6),
                new Evento("Evento Boda3-2", "2026-11-02", "Bogotá", 150, 8000, 4)
        ))); // 2 eventos
        organizadores.add(new Boda("Boda4", Arrays.asList(
                new Evento("Evento Boda4-1", "2026-12-01", "Cali", 300, 15000, 8),
                new Evento("Evento Boda4-2", "2026-12-02", "Cali", 250, 12000, 7),
                new Evento("Evento Boda4-3", "2026-12-03", "Cali", 200, 10000, 6)
        ))); // 3 eventos

        // 4 Conciertos
        organizadores.add(new Concierto("Concierto1", new ArrayList<>()));
        organizadores.add(new Concierto("Concierto2", Arrays.asList(
                new Evento("Rock Fest", "2026-10-20", "Medellín", 5000, 200000, 6)
        )));
        organizadores.add(new Concierto("Concierto3", Arrays.asList(
                new Evento("Jazz Night", "2026-11-10", "Bogotá", 800, 50000, 4),
                new Evento("Pop Party", "2026-11-11", "Bogotá", 1200, 70000, 5)
        )));
        organizadores.add(new Concierto("Concierto4", Arrays.asList(
                new Evento("Metal Fest", "2026-12-05", "Cali", 3000, 150000, 7),
                new Evento("Indie Fest", "2026-12-06", "Cali", 2000, 100000, 6),
                new Evento("Electro Fest", "2026-12-07", "Cali", 2500, 120000, 8)
        )));

        // 4 Conferencias
        organizadores.add(new Conferencia("Conferencia1", new ArrayList<>()));
        organizadores.add(new Conferencia("Conferencia2", Arrays.asList(
                new Evento("Tech Summit", "2026-10-25", "Medellín", 300, 20000, 5)
        )));
        organizadores.add(new Conferencia("Conferencia3", Arrays.asList(
                new Evento("AI Conference", "2026-11-15", "Bogotá", 400, 30000, 6),
                new Evento("Cloud Expo", "2026-11-16", "Bogotá", 350, 25000, 4)
        )));
        organizadores.add(new Conferencia("Conferencia4", Arrays.asList(
                new Evento("Cybersecurity Forum", "2026-12-10", "Cali", 500, 40000, 7),
                new Evento("Data Science Summit", "2026-12-11", "Cali", 450, 35000, 6),
                new Evento("Blockchain Meetup", "2026-12-12", "Cali", 300, 20000, 5),
                new Evento("IoT Workshop", "2026-12-13", "Cali", 250, 15000, 4)
        )));

        return organizadores;
    }
}
