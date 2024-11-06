package com.example.APPI.REST.G411.Servicios;

import com.example.APPI.REST.G411.MODELOS.Medicamento;
import com.example.APPI.REST.G411.MODELOS.Medico;
import com.example.APPI.REST.G411.repositorios.IRepositorioMedico;
import org.springframework.beans.factory.annotation.Autowired;

public class MedicoServicio {
    @Autowired
    IRepositorioMedico IRepositorioMedico;

    public Medico registrarMedico(Medico datosMedico){
        return null;
    }

    public Medico buscarMedico(Medico datosMedico){
        return null;
    }

    public Medico buscarMedicoId(Medico datosMedico){
        return null;
    }
}
