package com.example.APPI.REST.G411.Servicios;

import com.example.APPI.REST.G411.MODELOS.Enfermedad;
import com.example.APPI.REST.G411.repositorios.IRepositorioEnfermedad;
import org.springframework.beans.factory.annotation.Autowired;

public class EnfermedadServicio {
    @Autowired
    IRepositorioEnfermedad IRepositorioEnfermedad;

    public Enfermedad registrarEnfermedad(Enfermedad datosEnfermedad){
        return null;
    }

    public Enfermedad buscarEnfermedad(Enfermedad datosEnfermedad){
        return null;
    }

    public Enfermedad buscarEnfermedadId(Enfermedad datosEnfermedad){
        return null;
    }
}
