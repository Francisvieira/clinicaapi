package br.com.francis.clinicaapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.francis.clinicaapi.model.Cliente;


public interface Dadosrepository  extends JpaRepository<Cliente, Long>{
	
	
	
	

}
