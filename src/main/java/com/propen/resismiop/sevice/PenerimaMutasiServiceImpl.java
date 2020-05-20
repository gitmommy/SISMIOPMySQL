package com.propen.resismiop.sevice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.propen.resismiop.model.PenerimaMutasiModel;
import com.propen.resismiop.repository.PenerimaMutasiDb;

@Service
@Transactional
public class PenerimaMutasiServiceImpl implements PenerimaMutasiService{

	@Autowired
	PenerimaMutasiDb penerimaMutasiDb;

	@Override
	public PenerimaMutasiModel getPenerimaMutasiById(long id) {
		return penerimaMutasiDb.findById(id);
	}

	@Override
	public List<PenerimaMutasiModel> getAllPenerimaMutasi() {
		return penerimaMutasiDb.findAll();
	}

	@Override
	public PenerimaMutasiModel addPenerimaMutasi(PenerimaMutasiModel penerimaMutasi) {
		return penerimaMutasiDb.save(penerimaMutasi);
	}

	@Override
	public PenerimaMutasiModel updatePenerimaMutasi(PenerimaMutasiModel penerimaMutasi) {
		return penerimaMutasiDb.save(penerimaMutasi);
	}

	@Override
	public void deletePenerimaMutasi(PenerimaMutasiModel penerimaMutasi) {
		penerimaMutasiDb.delete(penerimaMutasi);
	}

}
