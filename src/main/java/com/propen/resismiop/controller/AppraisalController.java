package com.propen.resismiop.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.propen.resismiop.model.AppraisalModel;
import com.propen.resismiop.model.NOPModel;
import com.propen.resismiop.model.SpopModel;
import com.propen.resismiop.sevice.AppraisalService;
@Controller

public class AppraisalController {
	@Autowired
	private AppraisalService appraisalService;
	
	@RequestMapping(value = "/appraisal", method = RequestMethod.GET)
	private String viewUnpaidNOP(Model model) {
		List<AppraisalModel> listAppraisal = appraisalService.getAllAppraisal();
		model.addAttribute("appraisal", listAppraisal);
		return "appraisal";
		
	}
	@RequestMapping(value = "/form-appraisal", method = RequestMethod.GET)
	private String tambahAppraisal(Model model) {
		AppraisalModel appraisal = new AppraisalModel();
		model.addAttribute("appraisal", appraisal);
		return "form-appraisal";
	}
/*	@RequestMapping(value="/update-appraisal", method=RequestMethod.GET)
	private String updateAppraisal(@RequestParam(value="id") Long id, Model model) throws JsonParseException, JsonMappingException, IOException {

*//** 	1, 'Mendaftar di IGD'
 		2, 'Berada di IGD'
		3, 'Selesai di IGD'
		4, 'Mendaftar di Rawat Inap'
		5, 'Berada di Rawat Inap'
		6, 'Selesai di Rawat Inap'
		7, 'Mendaftar di Rawat Jalan'
		8, 'Berada di Rawat Jalan'
		9, 'Selesai di Rawat Jalan'
 *//*
		Map<Long, String> listStatus = new HashMap<Long, String>();
		listStatus.put((long) 7,"Mendaftar di Rawat Jalan");
		listStatus.put((long) 8,"Berada di Rawat Jalan");
		listStatus.put((long) 9,"Selesai di Rawat Jalan");
		List<PasienModel> allPasien = getAllPasien();
		PasienModel selectedPasien = null;
		for(PasienModel p : allPasien) {
			if(p.getId()==id) {
				selectedPasien = p;
			}
		}
		
		long curStatusId =  selectedPasien.getStatusPasien().getId();
		long nextStatusId = 0;
		if (curStatusId < 9 && curStatusId >= 7) 
			//status pasien Rawat Jalan hanya id 7,8,9
			nextStatusId = curStatusId+1; 
		else nextStatusId = curStatusId;
		
		String nextStatusJenis = listStatus.get(nextStatusId);
		
		System.out.println(nextStatusJenis);
		model.addAttribute("pasienstatus", selectedPasien.getStatusPasien().getJenis());
		model.addAttribute("nextStatusId", nextStatusId);
		model.addAttribute("nextStatusJenis", nextStatusJenis);
		model.addAttribute("pasien", selectedPasien);
		return "ubah-status-pasien";
	}

	*/
	@RequestMapping(value = "/form-appraisal", method = RequestMethod.POST)
	private String tambahAppraisalSubmit(Model model, @ModelAttribute AppraisalModel appraisal) {
		appraisalService.addAppraisal(appraisal);
		return "redirect:/appraisal";
		
	}
	@RequestMapping(value = "/appraisal/ubah/{id}", method = RequestMethod.GET)
	private String updateAppraisal(@PathVariable(value = "id") long id, Model model) {
		AppraisalModel arsipAppraisal = appraisalService.getAppraisalById(id);
		model.addAttribute("appraisal", arsipAppraisal);
		return "update-appraisal";
	}

	@RequestMapping(value = "/appraisal/ubah/{id}", method = RequestMethod.POST)
	private String updateAppraisalSubmit(Model model, @PathVariable(value = "id") long id,
			@ModelAttribute AppraisalModel appraisal) {
		appraisalService.updateAppraisal(appraisal);
		appraisalService.deleteAppraisal(appraisalService.getAppraisalById(id));
		return "redirect:/appraisal/";
	}
}
