package com.grupob.pastillero_backend.service;

import com.grupob.pastillero_backend.model.PlanMedicacion;
import com.grupob.pastillero_backend.repository.PlanMedicacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PlanMedicacionService {

    @Autowired
    private PlanMedicacionRepository repository;

    // 1. Guarda un nuevo plan (RF5)
    public PlanMedicacion guardarPlan(PlanMedicacion plan) {
        return repository.save(plan);
    }

    // 2. Lee todos los planes para mostrarlos
    public List<PlanMedicacion> obtenerTodos() {
        return repository.findAll();
    }

    // 3. Elimina un plan (RF8)
    public void eliminarPlan(Long id) {
        repository.deleteById(id);
    }
}