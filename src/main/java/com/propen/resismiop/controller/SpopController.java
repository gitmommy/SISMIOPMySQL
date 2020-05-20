package com.propen.resismiop.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.propen.resismiop.model.SpopModel;
import com.propen.resismiop.sevice.SpopService;

/**
 * Kelas Controller untuk SPOP/LSPOP
 * 
 * @author M. Davin Ramayuda
 *
 */
@Controller
public class SpopController {
	
	@Autowired
	private SpopService spopService;

	@RequestMapping(value = "/spop", method = RequestMethod.GET)
	private String viewSpop(Model model) {
		List<SpopModel> spopList = spopService.getAllSpop();
		model.addAttribute("spopList", spopList);
		return "spop-lspop";
		
	}
	
	@RequestMapping(value = "/spop-lspop", method = RequestMethod.GET)
	private String viewUnpaidSpop(Model model) {
		List<SpopModel> spopList = spopService.getAllSpop();
		model.addAttribute("spopList", spopList);
		return "spop-lspop";
		
	}
	
	@RequestMapping(value = "/spop-lspop/{id}", method = RequestMethod.GET)
	private String detailSpop(@PathVariable(value = "id") long id, Model model) {
		SpopModel arsipSpop = spopService.getSpopById(id);
		model.addAttribute("spop", arsipSpop);
		return "lihat-spop-lspop";		
	}
	
	@RequestMapping(value = "/spop-lspop/tambah", method = RequestMethod.GET)
	private String tambahSpop(Model model) {
		SpopModel spop = new SpopModel();
		model.addAttribute("spop", spop);
		return "form-spop-lspop";
	}

	@RequestMapping(value = "/spop-lspop/tambah", method = RequestMethod.POST)
	private String tambahSpopSubmit(Model model, @ModelAttribute SpopModel spop) {
		spopService.addSpop(spop);
		return "redirect:/spop-lspop";
		
	}
	
	@RequestMapping(value = "/spop-lspop/ubah/{id}", method = RequestMethod.GET)
	private String updateSpop(@PathVariable(value = "id") long id, Model model) {
		SpopModel arsipSpop = spopService.getSpopById(id);
		model.addAttribute("spop", arsipSpop);
		return "update-spop-lspop";
	}

	@RequestMapping(value = "/spop-lspop/ubah/{id}", method = RequestMethod.POST)
	private String updateSpopSubmit(Model model, @PathVariable(value = "id") long id,
			@ModelAttribute SpopModel spop) {
		spopService.updateSpop(spop);
		spopService.deleteSpop(spopService.getSpopById(id));
		return "redirect:/spop-lspop/";
	}

	@RequestMapping(value = "/spop-lspop/hapus/{id}", method = RequestMethod.GET)
	private String deleteSpop(@PathVariable(value = "id") long id, Model model) {
		spopService.deleteSpop(spopService.getSpopById(id));
		return "redirect:/spop-lspop/";
	}

}
