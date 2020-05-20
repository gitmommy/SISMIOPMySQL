package com.propen.resismiop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.propen.resismiop.model.PenerimaMutasiModel;

public interface PenerimaMutasiDb extends JpaRepository<PenerimaMutasiModel, Long> {
	PenerimaMutasiModel findById(long id);
}
