package com.propen.resismiop.sevice;

import java.util.List;

import com.propen.resismiop.model.AppraisalModel;
import com.propen.resismiop.model.NOPModel;


public interface AppraisalService {

	List<AppraisalModel> getAllNOP();
	AppraisalModel getNOPById(Long id);
	AppraisalModel addAppraisal(AppraisalModel appraisal);
	List<AppraisalModel> getAllAppraisal();
	AppraisalModel getAppraisalById(long id);
	
	AppraisalModel updateAppraisal(AppraisalModel appraisal);

	void deleteAppraisal(AppraisalModel appraisal);

}
