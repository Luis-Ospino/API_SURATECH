package com.example.APPI.REST.G411.repositorios;

import com.example.APPI.REST.G411.MODELOS.Medico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepositorioMedico extends JpaRepository<Medico, Long> {

}
