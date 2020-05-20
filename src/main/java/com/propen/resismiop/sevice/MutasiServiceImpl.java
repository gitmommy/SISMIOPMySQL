package com.propen.resismiop.sevice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.propen.resismiop.model.MutasiModel;
import com.propen.resismiop.repository.MutasiDb;

@Service
@Transactional
public class MutasiServiceImpl implements MutasiService{

	@Autowired
	MutasiDb mutasiDb;
	
	@Override
	public MutasiModel getMutasiById(long id) {
		return mutasiDb.findById(id);
	}

	@Override
	public List<MutasiModel> getAllMutasi() {
		return mutasiDb.findAll();
	}

	@Override
	public MutasiModel addMutasi(MutasiModel mutasi) {
		return mutasiDb.save(mutasi);
	}

	@Override
	public MutasiModel updateMutasi(MutasiModel mutasi) {
		return mutasiDb.save(mutasi);
	}

	@Override
	public void deleteMutasi(MutasiModel mutasi) {
		mutasiDb.delete(mutasi);
	}
}
