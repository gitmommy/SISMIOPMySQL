package com.propen.resismiop.sevice;

import java.util.List;

import com.propen.resismiop.model.MutasiModel;

public interface MutasiService {
	
	MutasiModel getMutasiById(long id);

	List<MutasiModel> getAllMutasi();

	MutasiModel addMutasi(MutasiModel mutasi);

	MutasiModel updateMutasi(MutasiModel mutasi);

	void deleteMutasi(MutasiModel mutasi);

}
