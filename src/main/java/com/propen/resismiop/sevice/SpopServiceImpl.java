package com.propen.resismiop.sevice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.propen.resismiop.model.SpopModel;
import com.propen.resismiop.repository.SpopDb;

@Service
@Transactional
public class SpopServiceImpl implements SpopService{

	@Autowired
	SpopDb spopDb;
	
	@Override
	public SpopModel getSpopById(long id) {
		return spopDb.findById(id);
	}

	@Override
	public List<SpopModel> getAllSpop() {
		return spopDb.findAll();
	}

	@Override
	public SpopModel addSpop(SpopModel spop) {
		return spopDb.save(spop);
	}

	@Override
	public SpopModel updateSpop(SpopModel spop) {
		return spopDb.save(spop);
	}

	@Override
	public void deleteSpop(SpopModel spop) {
		spopDb.delete(spop);
	}
}

