package com.example.APPI.REST.G411.Servicios;

import com.example.APPI.REST.G411.MODELOS.Paciente;
import com.example.APPI.REST.G411.MODELOS.signoVital;
import com.example.APPI.REST.G411.repositorios.IRepositorioSignoVital;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

     public List<signoVital> buscarSignoVital() throws Exception{
          try{
               return IRepositorioSignoVital.findAll();
          }catch (Exception error){
               throw new Exception(error.getMessage());
          }
     }

     public signoVital buscarSignoVitalId(signoVital datosSignoVital){
          return null;
     }
}
