package com.propen.resismiop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.propen.resismiop.model.DashboardModel;

public interface DashboardDb extends JpaRepository<DashboardModel, Long>{

	DashboardModel findById(long id);
}
