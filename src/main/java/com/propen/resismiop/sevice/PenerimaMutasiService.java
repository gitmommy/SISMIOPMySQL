package com.propen.resismiop.sevice;

import java.util.List;

import com.propen.resismiop.model.PenerimaMutasiModel;

public interface PenerimaMutasiService {
	
	PenerimaMutasiModel getPenerimaMutasiById(long id);

	List<PenerimaMutasiModel> getAllPenerimaMutasi();

	PenerimaMutasiModel addPenerimaMutasi(PenerimaMutasiModel penerimaMutasi);

	PenerimaMutasiModel updatePenerimaMutasi(PenerimaMutasiModel penerimaMutasi);

	void deletePenerimaMutasi(PenerimaMutasiModel penerimaMutasi);

}
