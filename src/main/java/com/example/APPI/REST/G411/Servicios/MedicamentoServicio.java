package com.example.APPI.REST.G411.Servicios;

import com.example.APPI.REST.G411.MODELOS.Medicamento;
import com.example.APPI.REST.G411.repositorios.IRepositorioMedicamento;
import org.springframework.beans.factory.annotation.Autowired;

public class MedicamentoServicio {
    @Autowired
    IRepositorioMedicamento IRepositorioMedicamento;

    public Medicamento registrarMedicamento(Medicamento datosMedicamento){
        return null;
    }

    public Medicamento buscarMedicamento(Medicamento datosMedicamento){
        return null;
    }

    public Medicamento buscarMedicamentoId(Medicamento datosMedicamento){
        return null;
    }
}
