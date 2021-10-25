package br.com.francis.clinicaapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.francis.clinicaapi.model.Medico;

public interface MedicoRepository extends JpaRepository<Medico, Long> {

}
