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
	private Date horaConsulta;
	
	@Column(nullable = false)
	private String especialidade;
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
	public Date getHoraConsulta() {
		return horaConsulta;
	}
	public void setHoraConsulta(Date horaConsulta) {
		this.horaConsulta = horaConsulta;
	}
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
	

}
