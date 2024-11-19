package com.example.APPI.REST.G411.Servicios;

import com.example.APPI.REST.G411.MODELOS.Medicamento;
import com.example.APPI.REST.G411.MODELOS.Medico;
import com.example.APPI.REST.G411.MODELOS.signoVital;
import com.example.APPI.REST.G411.repositorios.IRepositorioMedico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicoServicio {
    @Autowired
    IRepositorioMedico IRepositorioMedico;

    public Medico registrarMedico(Medico datosMedico) throws Exception{
        try{
            // guardar en la BBDD los datos del paciente
            return IRepositorioMedico.save(datosMedico);
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }

    public List<Medico> buscarMedico() throws Exception{
        try{
            return IRepositorioMedico.findAll();
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }

    public Medico buscarMedicoId(Medico datosMedico){
        return null;
    }
}
