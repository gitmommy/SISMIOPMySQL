package com.propen.resismiop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.propen.resismiop.model.SpopModel;

public interface SpopDb extends JpaRepository<SpopModel, Long> {
	SpopModel findById(long id);
}