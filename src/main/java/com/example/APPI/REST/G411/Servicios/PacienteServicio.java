package com.example.APPI.REST.G411.Servicios;

import com.example.APPI.REST.G411.MODELOS.Paciente;
import com.example.APPI.REST.G411.repositorios.IRepositorioPaciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacienteServicio {
    // primer proceso: para usar un servicio debo llamar al repositorio

    // INYECTAR UNA DEPENDENCIA
    @Autowired
    IRepositorioPaciente IRepositorioPaciente;

    // Listo las operaciones que voy a realizar en BD

    // Registrar Paciente
    public Paciente registrarPaciente(Paciente datosPaciente) throws Exception{
       try{
           // guardar en la BBDD los datos del paciente
           return IRepositorioPaciente.save(datosPaciente);
       }catch (Exception error){
           throw new Exception(error.getMessage());
       }
    }

    // buscar pacientes

    public List<Paciente> buscarPacientes() throws Exception{
        try{
            return IRepositorioPaciente.findAll();
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }

    // buscar un paciente por id

    public Paciente buscarPacienteId(Paciente datosPaciente){
        return null;
    }
}
