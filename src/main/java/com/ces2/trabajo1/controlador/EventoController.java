package com.ces2.trabajo1.controlador;

import com.ces2.trabajo1.modelo.Boda;
import com.ces2.trabajo1.modelo.Concierto;
import com.ces2.trabajo1.modelo.Conferencia;
import com.ces2.trabajo1.modelo.Evento;
import com.ces2.trabajo1.modelo.EventoResultado;
import com.ces2.trabajo1.modelo.OrganizadorEvento;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class EventoController {

    @GetMapping("/eventos")
    public String verEventos(Model model) {

   
        List<OrganizadorEvento> eventos = List.of(
                new Boda(new Evento("Boda de Ana y Luis", "2026-10-10", "Salón Jardín", 120, 15000000)),
                new Boda(new Evento("Boda de Marcela y Jorge", "2026-11-02", "Hacienda Los Alamos", 80, 9500000)),
                new Boda(new Evento("Boda de Carla y Pedro", "2026-12-05", "Club Campestre", 150, 22000000)),

                new Concierto(new Evento("Concierto Rock en Vivo", "2026-09-20", "Estadio Metropolitano", 5000, 80000000)),
                new Concierto(new Evento("Concierto Sinfónico", "2026-10-15", "Teatro Metropolitano", 900, 25000000)),
                new Concierto(new Evento("Concierto Vallenato", "2026-11-30", "Plaza Mayor", 3000, 40000000)),

                new Conferencia(new Evento("Conferencia de Tecnología", "2026-09-25", "Centro de Convenciones", 400, 12000000)),
                new Conferencia(new Evento("Conferencia de Innovación", "2026-10-08", "Auditorio Universidad", 250, 6000000)),
                new Conferencia(new Evento("Conferencia de Emprendimiento", "2026-11-12", "Hotel Intercontinental", 300, 8000000))
        );


        List<EventoResultado> resultados = eventos.stream()
                .map(e -> new EventoResultado(
                        e.getClass().getSimpleName(),
                        e.planificar(),
                        e.ejecutar(),
                        e.cerrar()
                ))
                .toList();

        model.addAttribute("resultados", resultados);
        return "eventos";
    }
}
