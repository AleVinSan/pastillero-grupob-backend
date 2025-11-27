package com.grupob.pastillero_backend.model;
import jakarta.persistence.*;

@Entity
@Table(name = "plan_medicacion")
public class PlanMedicacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; 

    private String medicamento;    
    private String dosis;          
    private String horario;        
    private Integer compartimento; 

    
    public PlanMedicacion() {
    }

    
    public PlanMedicacion(String medicamento, String dosis, String horario, Integer compartimento) {
        this.medicamento = medicamento;
        this.dosis = dosis;
        this.horario = horario;
        this.compartimento = compartimento;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getMedicamento() { return medicamento; }
    public void setMedicamento(String medicamento) { this.medicamento = medicamento; }
    public String getDosis() { return dosis; }
    public void setDosis(String dosis) { this.dosis = dosis; }
    public String getHorario() { return horario; }
    public void setHorario(String horario) { this.horario = horario; }
    public Integer getCompartimento() { return compartimento; }
    public void setCompartimento(Integer compartimento) { this.compartimento = compartimento; }
}

