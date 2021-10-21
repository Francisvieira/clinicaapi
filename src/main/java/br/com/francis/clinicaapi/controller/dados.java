package br.com.francis.clinicaapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.francis.clinicaapi.model.Cliente;
//import br.com.francis.clinicaapi.model.cliente.Clientes;
import br.com.francis.clinicaapi.repository.Dadosrepository;

/*
 * em nosso projeto iremos utilizar algumas anotaçoes (annotations) que 
 * sao elementos de triplificaçao de codico, ou seja, sao aplicaçoes que fazemos
 * no codigo  para informar o que aquela linha ou grupo  de comando deve fazer 
 * e como deve ser entendido.
 * No caso abaixo, estamos dizendo que nossa classe Dados é um controlador de fluxo que receberá comandos em 
 * Rest e responderá dados no formato Rest. 
 *  
 * 
 */



@RestController
@RequestMapping("/")
public class Dados {
@Autowired

	private Dadosrepository dr;
	@PostMapping("/cad")
	public String cadastro(@RequestBody Cliente cliente) {
		dr.save(cliente);
		return "Cliente cadastrado com sucesso";
	}
	@GetMapping
	public List<Cliente> clientes(){
		return dr.findAll();
	}
}
