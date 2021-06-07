package com.medilab.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.medilab.app.entities.Exam;

@Repository
public interface ExamRepository extends JpaRepository<Exam, Long>	{

	//@Query(value = "SELECT p FROM Exam where p = :PID", nativeQuery = false)
	//public Exam findPatientByPID(String PID);
	
	
	//@Query(value = "SELECT u FROM User u ORDER BY id")
	//Page<User> findAllUsersWithPagination(Pageable pageable);
	
}
