package br.com.francis.clinicaapi.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.francis.clinicaapi.model.Cliente;

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
public class dados {
	@GetMapping
	public String inicial() { 
	return "olá, vc esta na pagina inicial do projeto"; 
	}
	
	@GetMapping("/cliente")
	public list <Cliente> cliente()
	
	{ 
 		return "Heloisa Nascimento";
		
	}
	@GetMapping("/clientes")
	public list <Clientes>  clientes() 
	
	{
		List<Cliente> lst = ArrayList<Cliente>();
		Cliente c1 =new Cliente();
		Cliente c2 =new Cliente();
		c1.setNome("vanessa");
		c2.setNome("wagner");
		lst.add(c1);
		lst.add(c2);
		
		return lst ;
		
}
	@PostMapping("/cadastro")
public String cadastro () { 
	return "cadastro realizado";
} 
	@PutMapping("/ataulizar")
	public String atualizar () {
		return "Dados atualizados";
	}
	@DeleteMapping ("/apagar")
	public String apagar ( ) {
		return "dados deletados";
	}
	
	
}
