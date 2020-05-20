package com.propen.resismiop.sevice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.propen.resismiop.model.DashboardModel;
import com.propen.resismiop.repository.DashboardDb;
@Service
@Transactional
public class DashboardServiceImpl implements DashboardService {

	
	@Autowired
	DashboardDb dashboardDb;
	@Override
	public List<DashboardModel> getAllPBB() {
		return dashboardDb.findAll();
	}

	
	
	
}
