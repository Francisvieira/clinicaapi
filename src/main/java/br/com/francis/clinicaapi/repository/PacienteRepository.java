package br.com.francis.clinicaapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.francis.clinicaapi.model.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {

}
