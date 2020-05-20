package com.propen.resismiop.sevice;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.propen.resismiop.model.AppraisalModel;
import com.propen.resismiop.model.SpopModel;
import com.propen.resismiop.repository.AppraisalDb;



@Service
@Transactional
public class AppraisalServiceImpl implements AppraisalService{

	
	@Autowired
	AppraisalDb appraisalDb;
	
	@Override
	public AppraisalModel getNOPById(Long Nop) {
/*		return NOPDb.findById(Nop);*/
		return null;
	}

	@Override
	public List<AppraisalModel> getAllNOP() {
		return appraisalDb.findAll();
	}

	@Override
	public AppraisalModel addAppraisal(AppraisalModel appraisal) {
			return appraisalDb.save(appraisal);
	}

	@Override
	public List<AppraisalModel> getAllAppraisal() {
		return appraisalDb.findAll();
	}

	@Override
	public AppraisalModel getAppraisalById(long id) {
		return appraisalDb.findById(id);
	}

	@Override
	public AppraisalModel updateAppraisal(AppraisalModel appraisal) {
		return appraisalDb.save(appraisal);
	}

	@Override
	public void deleteAppraisal(AppraisalModel appraisal) {
		appraisalDb.delete(appraisal);
		
	}

}
