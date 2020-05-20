package com.propen.resismiop.repository;

import com.propen.resismiop.model.AppraisalModel;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AppraisalDb extends JpaRepository<AppraisalModel, Long>{

AppraisalModel findById(long id);
	
}
