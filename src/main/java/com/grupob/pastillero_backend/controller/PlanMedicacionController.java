package com.grupob.pastillero_backend.controller;

import com.grupob.pastillero_backend.model.PlanMedicacion;
import com.grupob.pastillero_backend.service.PlanMedicacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/planes") // dirección web: http://localhost:8080/api/planes
public class PlanMedicacionController {

    @Autowired
    private PlanMedicacionService service;

    // 1. Ver todos los planes (GET)
    @GetMapping
    public List<PlanMedicacion> listarPlanes() {
        return service.obtenerTodos();
    }

    // 2. Crear un nuevo plan (POST)
    @PostMapping
    public PlanMedicacion crearPlan(@RequestBody PlanMedicacion plan) {
        return service.guardarPlan(plan);
    }

    // 3. Borrar un plan por ID (DELETE)
    @DeleteMapping("/{id}")
    public void eliminarPlan(@PathVariable Long id) {
        service.eliminarPlan(id);
    }
}