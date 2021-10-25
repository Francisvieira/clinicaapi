package br.com.francis.clinicaapi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.francis.clinicaapi.model.Agenda;
import br.com.francis.clinicaapi.repository.AgendaRepository;

@RequestMapping("/agenda")
@RestController
public class AgendaController {

	@Autowired
	@GetMapping("/listar")
	public List<Agenda> listar(){	
		return ag.findAll();
	}
	
	@Autowired
	private AgendaRepository ag;
	@PostMapping("/cadastro")
	public String cadastro( @RequestBody Agenda agenda) {	
		ag.save(agenda);
		return "Agendado com sucesso";
	}
	@PutMapping("/atualizar/{id}")
	public String atualizar(@PathVariable Long id,@RequestBody Agenda agenda) {
		Optional<Agenda> ar =ag.findById(id);
		if(!ar.isPresent()) {
			return "Agenda não encontrada";
			
		}
			agenda .setIdpaciente(id);
			ag.save(agenda);
			return "dados do paciente atualizados";
		}
		
		@DeleteMapping("/apagar/{id}")
		public String apagar(@PathVariable Long id) {	
			ag.deleteById(id);
			return "desagendado";
	}
}


