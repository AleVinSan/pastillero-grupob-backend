package com.grupob.pastillero_backend.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PlanMedicacionTest {

    @Test
    @DisplayName("Test: Crear objeto y probar Setters y Getters")
    void testCrearYAsignarValores() {
        // 1. Preparamos los datos
        PlanMedicacion plan = new PlanMedicacion();
        Long id = 1L;
        
        // 2. Ejecutamos (usamos los setters)
        plan.setId(id);
        // NOTA: Si tu clase tiene más campos (ej. nombre, dosis), añádelos aquí:
        // plan.setNombre("Paracetamol"); 
        
        // 3. Verificamos (usamos los getters)
        assertEquals(id, plan.getId());
        assertNotNull(plan.toString()); // Probamos que el método toString existe
    }
}