package br.com.francis.clinicaapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Paciente {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Long idpaciente; 
	
	@Column(length=100,nullable=false,unique =true)
	private String emailPaciente;
	
	@Column
	private String telefonePaciente;

	public Paciente() {
	}

	public Paciente(Long idpaciente, String emailPaciente, String telefonePaciente) {
		this.idpaciente = idpaciente;
		this.emailPaciente = emailPaciente;
		this.telefonePaciente = telefonePaciente;
	}

	public Long getIdpaciente() {
		return idpaciente;
	}

	public void setIdpaciente(Long idpaciente) {
		this.idpaciente = idpaciente;
	}

	public String getEmailPaciente() {
		return emailPaciente;
	}

	public void setEmailPaciente(String emailPaciente) {
		this.emailPaciente = emailPaciente;
	}

	public String getTelefonePaciente() {
		return telefonePaciente;
	}

	public void setTelefonePaciente(String telefonePaciente) {
		this.telefonePaciente = telefonePaciente;
	}

	
}
