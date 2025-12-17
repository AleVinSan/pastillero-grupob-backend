package com.grupob.pastillero_backend.service;

import com.grupob.pastillero_backend.model.PlanMedicacion;
import com.grupob.pastillero_backend.repository.PlanMedicacionRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class PlanMedicacionServiceTest {

    @Mock
    private PlanMedicacionRepository repositorioMock;

    @InjectMocks
    private PlanMedicacionService servicio;

    @Test
    @DisplayName("Test: Listar planes (Mockeado)")
    void testListarTodos() {
        // 1. Preparamos el "truco" (simulamos que la base de datos devuelve una lista vacía)
        when(repositorioMock.findAll()).thenReturn(Collections.emptyList());

        // 2. Llamamos al servicio real
        // ¡OJO! Si 'findAll' se pone en rojo, prueba a cambiarlo por 'getAllPlanMedicacion'
        List<PlanMedicacion> resultado = servicio.obtenerTodos(); 

        // 3. Comprobamos
        assertNotNull(resultado);
        verify(repositorioMock, times(1)).findAll();
    }

    @Test
    @DisplayName("Test: Guardar plan (Mockeado)")
    void testGuardar() {
        // 1. Preparamos
        PlanMedicacion plan = new PlanMedicacion();
        when(repositorioMock.save(any(PlanMedicacion.class))).thenReturn(plan);

        // 2. Ejecutamos
        // ¡OJO! Si 'save' se pone en rojo, prueba con 'savePlanMedicacion'
        PlanMedicacion guardado = servicio.guardarPlan(plan);

        // 3. Comprobamos
        assertNotNull(guardado);
    }
}