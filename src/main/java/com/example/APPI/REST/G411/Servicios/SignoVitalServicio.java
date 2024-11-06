package com.example.APPI.REST.G411.Servicios;

import com.example.APPI.REST.G411.MODELOS.signoVital;
import com.example.APPI.REST.G411.repositorios.IRepositorioSignoVital;
import org.springframework.beans.factory.annotation.Autowired;

public class SignoVitalServicio {
     @Autowired
     IRepositorioSignoVital IRepositorioSignoVital;

     public signoVital registrarSignoVital(signoVital datosSignoVital){
          return null;
     }

     public signoVital buscarSignoVital(signoVital datosSignoVital){
          return null;
     }

     public signoVital buscarSignoVitalId(signoVital datosSignoVital){
          return null;
     }
}
