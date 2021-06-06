package com.medilab.app.dto;

import java.time.LocalDate;


import com.medilab.app.entities.Exam;

public class ExamDTO {

	private Long id;
	private String nome;
	private String numAcesso;
	private String visita;
	private String patientID;
	private LocalDate data;
	private String tipoExame;
	private String modalidade;
	private String numero;
	private Integer estado;
	private String medSol;
	private char laudo;
	private char sexo;
	private char especial;
	private char urgente;
	private char restaurado;

	public ExamDTO() {

	}

	public ExamDTO(Long id, String nome, String numAcesso, String visita, String patientID, LocalDate data,
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

	public ExamDTO(Exam stub) {
		super();
		this.id = stub.getId();
		this.nome = stub.getNome();
		this.numAcesso = stub.getNumAcesso();
		this.visita = stub.getVisita();
		this.patientID = stub.getPatientID();
		this.data = stub.getData();
		this.tipoExame = stub.getTipoExame();
		this.numero = stub.getNumero();
		this.estado = stub.getEstado();
		this.medSol = stub.getMedSol();
		this.laudo = stub.getLaudo();
		this.sexo = stub.getSexo();
		this.especial = stub.getEspecial();
		this.urgente = stub.getUrgente();
		this.restaurado = stub.getRestaurado();
		this.modalidade = stub.getModalidade();
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
