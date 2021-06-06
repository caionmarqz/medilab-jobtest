package com.medilab.app.entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.medilab.app.dto.ExamDTO;

@Entity
@Table(name = "tb_exam")
public class Exam implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "numacesso")
	private String numAcesso;
	
	@Column(name = "visita")
	private String visita;

	@Column(name = "patientid")
	private String patientID;
	
	@Column(name = "data")
	private LocalDate data;
	
	@Column(name = "tipoexame")
	private String tipoExame;
	
	@Column(name = "modalidade")
    private String modalidade;
	
	@Column(name = "numero")
	private String numero;
	
	@Column(name = "estado")
	private Integer estado;
	
	@Column(name = "medsol")
	private String medSol;
	
	@Column(name = "laudo")
	private char laudo;
	
	@Column(name = "sexo")
	private char sexo;
	
	@Column(name = "especial")
	private char especial;

	@Column(name = "urgente")
	private char urgente;
	
	@Column(name = "restaurado")
	private char restaurado;
	

	
	
	
	public Exam() {

	}

	public Exam(Long id, String nome, String numAcesso, String visita, String patientID, LocalDate data,
			String tipoExame, String modalidade, String numero, Integer estado, String medSol, char laudo, char sexo, char especial,
			char urgente, char restaurado) {
		super();
		this.id = id;
		this.nome = nome;
		this.numAcesso = numAcesso;
		this.visita = visita;
		this.patientID = patientID;
		this.data = data;
		this.tipoExame = tipoExame;
		this.numero = numero;
		this.estado = estado;
		this.medSol = medSol;
		this.laudo = laudo;
		this.sexo = sexo;
		this.especial = especial;
		this.urgente = urgente;
		this.restaurado = restaurado;
		this.modalidade = modalidade;
	}

	public Exam(Exam stub) {
		super();
		this.id = stub.id;
		this.nome = stub.nome;
		this.numAcesso = stub.numAcesso;
		this.visita = stub.visita;
		this.patientID = stub.patientID;
		this.data = stub.data;
		this.tipoExame = stub.tipoExame;
		this.numero = stub.numero;
		this.estado = stub.estado;
		this.medSol = stub.medSol;
		this.laudo = stub.laudo;
		this.sexo = stub.sexo;
		this.especial = stub.especial;
		this.urgente = stub.urgente;
		this.restaurado = stub.restaurado;
		this.modalidade = stub.modalidade;
	}
	
	

	public Exam(ExamDTO dto) {
		super();
		this.id = dto.getId();
		this.nome = dto.getNome();
		this.numAcesso = dto.getNumAcesso();
		this.visita = dto.getVisita();
		this.patientID = dto.getPatientID();
		this.data = dto.getData();
		this.tipoExame = dto.getTipoExame();
		this.numero = dto.getNumero();
		this.estado = dto.getEstado();
		this.medSol = dto.getMedSol();
		this.laudo = dto.getLaudo();
		this.sexo = dto.getSexo();
		this.especial = dto.getEspecial();
		this.urgente = dto.getUrgente();
		this.restaurado = dto.getRestaurado();
		this.modalidade = dto.getModalidade();
	}
	
	
	

	public String getModalidade() {
		return modalidade;
	}

	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNumAcesso() {
		return numAcesso;
	}

	public void setNumAcesso(String numAcesso) {
		this.numAcesso = numAcesso;
	}

	public String getVisita() {
		return visita;
	}

	public void setVisita(String visita) {
		this.visita = visita;
	}

	public String getPatientID() {
		return patientID;
	}

	public void setPatientID(String patientID) {
		this.patientID = patientID;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public String getTipoExame() {
		return tipoExame;
	}

	public void setTipoExame(String tipoExame) {
		this.tipoExame = tipoExame;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Integer getEstado() {
		return estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}

	public String getMedSol() {
		return medSol;
	}

	public void setMedSol(String medSol) {
		this.medSol = medSol;
	}

	public char getLaudo() {
		return laudo;
	}

	public void setLaudo(char laudo) {
		this.laudo = laudo;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public char getEspecial() {
		return especial;
	}

	public void setEspecial(char especial) {
		this.especial = especial;
	}

	public char getUrgente() {
		return urgente;
	}

	public void setUrgente(char urgente) {
		this.urgente = urgente;
	}

	public char getRestaurado() {
		return restaurado;
	}

	public void setRestaurado(char restaurado) {
		this.restaurado = restaurado;
	}

}
