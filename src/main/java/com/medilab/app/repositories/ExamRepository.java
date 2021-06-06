package com.medilab.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medilab.app.entities.Exam;

public interface ExamRepository extends JpaRepository<Exam, Long>	{

}
