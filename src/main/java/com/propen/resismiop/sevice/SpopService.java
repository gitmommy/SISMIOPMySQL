package com.propen.resismiop.sevice;

import java.util.List;

import com.propen.resismiop.model.SpopModel;

public interface SpopService {
	
	SpopModel getSpopById(long id);

	List<SpopModel> getAllSpop();

	SpopModel addSpop(SpopModel spop);

	SpopModel updateSpop(SpopModel spop);

	void deleteSpop(SpopModel spop);

}