package com.example.APPI.REST.G411.Servicios;

import com.example.APPI.REST.G411.MODELOS.Paciente;
import com.example.APPI.REST.G411.repositorios.IRepositorioPaciente;
import org.springframework.beans.factory.annotation.Autowired;

public class PacienteServicio {
    // primer proceso: para usar un servicio debo llamar al repositorio

    // INYECTAR UNA DEPENDENCIA
    @Autowired
    IRepositorioPaciente IRepositorioPaciente;

    // Listo las operaciones que voy a realizar en BD

    // Registrar Paciente
    public Paciente registrarPaciente(Paciente datosPaciente){
        return null;
    }

    // buscar pacientes
    public Paciente buscarPaciente(Paciente datosPaciente){
        return null;
    }

    // buscar un paciente por id

    public Paciente buscarPacienteId(Paciente datosPaciente){
        return null;
    }
}
