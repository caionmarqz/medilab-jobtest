package com.medilab.app.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.medilab.app.dto.ExamDTO;
import com.medilab.app.services.ExamService;


@RestController
@RequestMapping(value = "/exams")
public class ExamController {
	
	@Autowired
	ExamService examService;
	
	
	@GetMapping
	public ResponseEntity<Page<ExamDTO>> findall(
			@RequestParam(value = "page", defaultValue = "0") Integer page,
			@RequestParam(value = "linesPerPage", defaultValue = "12") Integer linesPerPage,
			@RequestParam(value = "orderBy", defaultValue = "nome") String orderBy,
			@RequestParam(value = "direction", defaultValue = "ASC") String direction
			) {
		PageRequest pageRequest = PageRequest.of(page, linesPerPage, Direction.valueOf(direction), orderBy);
		
		
		Page<ExamDTO> list = examService.findAllPaged(pageRequest);
		
		return ResponseEntity.ok(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<ExamDTO> findById(@PathVariable("id") Long id) {
		ExamDTO client = examService.findById(id);
		return ResponseEntity.ok(client);
	}
	
	@PostMapping
	public ResponseEntity<ExamDTO> insert(@RequestBody ExamDTO client) {
		ExamDTO append = examService.insert(client);
		return ResponseEntity.ok(append);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable("id") Long id) {
		examService.delete(id);
		return ResponseEntity.ok(null);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<ExamDTO> update(@PathVariable Long id, @RequestBody ExamDTO client) {
		ExamDTO updated = examService.update(id, client);
		return ResponseEntity.ok(updated);
	}
	
//	@GetMapping("/search/{PID}")
//	public ResponseEntity<ExamDTO> findPatientByPID(@PathVariable("PID") String pid) {
//		ExamDTO client = examService.findPatientByPID(pid);
//		return ResponseEntity.ok(client);
//	}
	
	
	

}
