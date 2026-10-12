package com.ces2.trabajo1.modelo;

import java.util.List;

public interface OrganizadorEvento extends Cerrable {

    String getNombre();

    List<Evento> getEventos();
}
