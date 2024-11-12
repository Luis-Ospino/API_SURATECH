package com.example.APPI.REST.G411.repositorios;

import com.example.APPI.REST.G411.MODELOS.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepositorioPaciente extends JpaRepository<Paciente, Long> {

}
