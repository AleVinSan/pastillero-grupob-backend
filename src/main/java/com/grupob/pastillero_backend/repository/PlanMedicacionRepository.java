package com.grupob.pastillero_backend.repository;

import com.grupob.pastillero_backend.model.PlanMedicacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanMedicacionRepository extends JpaRepository<PlanMedicacion, Long> {
    
}