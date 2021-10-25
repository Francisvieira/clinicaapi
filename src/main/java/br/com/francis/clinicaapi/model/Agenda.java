package br.com.francis.clinicaapi.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Agenda {
	
@Id
@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Long idagenda;
	
@Column
	private Long Idpaciente;
	
@Column
	private Long idMedico;
	@Column(nullable = false )
	private Date dataConsulta;
	
	@Column(nullable = false)
	private String horaConsulta;
	
	@Column(nullable = false)
	private String especialidade;

	public Agenda() {
	}

	public Agenda(Long idagenda, Long idpaciente, Long idMedico, Date dataConsulta, String horaConsulta,
			String especialidade) {
		this.idagenda = idagenda;
		Idpaciente = idpaciente;
		this.idMedico = idMedico;
		this.dataConsulta = dataConsulta;
		this.horaConsulta = horaConsulta;
		this.especialidade = especialidade;
	}

	public Long getIdagenda() {
		return idagenda;
	}

	public void setIdagenda(Long idagenda) {
		this.idagenda = idagenda;
	}

	public Long getIdpaciente() {
		return Idpaciente;
	}

	public void setIdpaciente(Long idpaciente) {
		Idpaciente = idpaciente;
	}

	public Long getIdMedico() {
		return idMedico;
	}

	public void setIdMedico(Long idMedico) {
		this.idMedico = idMedico;
	}

	public Date getDataConsulta() {
		return dataConsulta;
	}

	public void setDataConsulta(Date dataConsulta) {
		this.dataConsulta = dataConsulta;
	}

	public String getHoraConsulta() {
		return horaConsulta;
	}

	public void setHoraConsulta(String horaConsulta) {
		this.horaConsulta = horaConsulta;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

}