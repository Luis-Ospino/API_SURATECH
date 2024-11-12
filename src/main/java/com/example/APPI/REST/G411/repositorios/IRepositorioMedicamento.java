package com.example.APPI.REST.G411.repositorios;

import com.example.APPI.REST.G411.MODELOS.Medicamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepositorioMedicamento extends JpaRepository<Medicamento, Long> {

}
