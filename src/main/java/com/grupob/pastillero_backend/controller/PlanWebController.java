package com.grupob.pastillero_backend.controller;

import com.grupob.pastillero_backend.service.PlanMedicacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller; // OJO: Controller, no RestController
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PlanWebController {

    @Autowired
    private PlanMedicacionService service;

    @GetMapping("/planes-vista") // URL: http://localhost:8080/planes-vista
    public String listarPlanes(Model model) {
        // Obtenemos planes de la DB y se los pasamos al HTML
        model.addAttribute("listaPlanes", service.obtenerTodos());
        return "planes"; // Busca archivo llamado 'planes.html'
    }
}