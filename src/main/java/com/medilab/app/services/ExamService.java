package com.medilab.app.services;

import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.medilab.app.dto.ExamDTO;
import com.medilab.app.entities.Exam;
import com.medilab.app.repositories.ExamRepository;
import com.medilab.app.services.exceptions.DatabaseException;
import com.medilab.app.services.exceptions.ResourceNotFoundException;

@Service
public class ExamService {
	
	
	@Autowired
	ExamRepository examRepository;
	
	
	@Transactional(readOnly = true)
	public Page<ExamDTO> findAllPaged(PageRequest pageRequest) {
		Page<Exam> list = examRepository.findAll(pageRequest);
		Page<ExamDTO> result = list.map(x -> new ExamDTO(x));
		return result;
	}

	@Transactional
	public ExamDTO insert(ExamDTO dto) {
		Exam entity = new Exam(dto);
		entity = examRepository.save(entity);
		return new ExamDTO(entity);
	}

	@Transactional(readOnly = true)
	public ExamDTO findById(Long id) {
		Optional<Exam> obj = examRepository.findById(id);
		Exam entity = obj.orElseThrow(() -> new ResourceNotFoundException("Resource not found"));
		return new ExamDTO(entity);
	}
	
//	public ExamDTO findPatientByPID(String pid) {
//		Exam entity = examRepository.findPatientByPID(pid);
//		return new ExamDTO(entity);
//	}
	

	public void delete(Long id) {
		try {
			examRepository.deleteById(id);
		}
		catch (EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException("id="+id+" does not exists");
		}
		catch (DataIntegrityViolationException e) {
			throw new DatabaseException("Database integrity violation "+e.getStackTrace().toString());
		}
	}

	@Transactional
	public ExamDTO update(Long id, ExamDTO dto) {
		try {
			Exam exam = examRepository.getOne(id);
			exam.setData(dto.getData());
			exam.setEspecial(dto.getEspecial());
			exam.setEstado(dto.getEstado());
			exam.setId(dto.getId());
			exam.setLaudo(dto.getLaudo());
			exam.setMedSol(dto.getMedSol());
			exam.setNome(dto.getNome());
			exam.setNumAcesso(dto.getNumAcesso());
			exam.setNumero(dto.getNumero());
			exam.setPatientID(dto.getPatientID());
			exam.setRestaurado(dto.getRestaurado());
			exam.setSexo(dto.getSexo());
			exam.setTipoExame(dto.getTipoExame());
			exam.setUrgente(dto.getUrgente());
			exam.setVisita(dto.getVisita());
			exam = examRepository.save(exam);
			return new ExamDTO(exam);
		}
		catch (EntityNotFoundException e) {
			throw new ResourceNotFoundException("id not found "+id);
		}
	}

}
