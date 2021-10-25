package br.com.francis.clinicaapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.francis.clinicaapi.model.Agenda;

public interface AgendaRepository extends JpaRepository<Agenda, Long> {

}
