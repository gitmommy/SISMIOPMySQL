package com.propen.resismiop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.propen.resismiop.model.MutasiModel;

public interface MutasiDb extends JpaRepository<MutasiModel, Long> {
	MutasiModel findById(long id);
}