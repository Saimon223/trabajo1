package com.ces2.trabajo1.controlador;

import com.ces2.trabajo1.modelo.OrganizadorEvento;
import com.ces2.trabajo1.repositories.OrganizadorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class OrganizadorController {

    private OrganizadorRepository repository = new OrganizadorRepository();

    @GetMapping("/peticion1")
    public String peticion1(Model model) {
        List<OrganizadorEvento> organizadores = repository.getOrganizadores();
        List<String> nombres = organizadores.stream()
                .map(OrganizadorEvento::getNombre)
                .collect(Collectors.toList());
        model.addAttribute("nombres", nombres);
        return "vista1";
    }

    @GetMapping("/peticion2")
    public String peticion2(Model model) {
        List<OrganizadorEvento> organizadores = repository.getOrganizadores();
        long totalEventos = organizadores.stream()
                .mapToLong(o -> o.getEventos().size())
                .sum();
        model.addAttribute("totalEventos", totalEventos);
        return "vista2";
    }

    @GetMapping("/peticion3")
    public String peticion3(Model model) {
        List<OrganizadorEvento> organizadores = repository.getOrganizadores();
        List<String> lugares = organizadores.stream()
                .flatMap(o -> o.getEventos().stream().map(e -> e.getLugar()))
                .distinct()
                .collect(Collectors.toList());
        model.addAttribute("lugares", lugares);
        return "vista3";
    }

    @GetMapping("/peticion4")
    public String peticion4(Model model) {
        List<OrganizadorEvento> organizadores = repository.getOrganizadores();
        int maxInvitados = organizadores.stream()
                .flatMap(o -> o.getEventos().stream())
                .mapToInt(e -> e.getNumeroInvitados())
                .max()
                .orElse(0);
        model.addAttribute("maxInvitados", maxInvitados);
        return "vista4";
    }

    @GetMapping("/peticion5")
    public String peticion5(Model model) {
        List<OrganizadorEvento> organizadores = repository.getOrganizadores();
        boolean hayEventoLargo = organizadores.stream()
                .flatMap(o -> o.getEventos().stream())
                .anyMatch(e -> e.getDuracionHoras() != null && e.getDuracionHoras() > 6);
        model.addAttribute("hayEventoLargo", hayEventoLargo);
        return "vista5";
    }
}
