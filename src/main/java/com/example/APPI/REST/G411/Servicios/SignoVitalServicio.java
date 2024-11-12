package com.example.APPI.REST.G411.Servicios;

import com.example.APPI.REST.G411.MODELOS.signoVital;
import com.example.APPI.REST.G411.repositorios.IRepositorioSignoVital;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SignoVitalServicio {
     @Autowired
     IRepositorioSignoVital IRepositorioSignoVital;

     public signoVital registrarSignoVital(signoVital datosSignoVital) throws Exception{
          try{
               // guardar en la BBDD los datos del paciente
               return IRepositorioSignoVital.save(datosSignoVital);
          }catch (Exception error){
               throw new Exception(error.getMessage());
          }
     }

     public signoVital buscarSignoVital(signoVital datosSignoVital){
          return null;
     }

     public signoVital buscarSignoVitalId(signoVital datosSignoVital){
          return null;
     }
}
