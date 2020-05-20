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

import com.propen.resismiop.model.MutasiModel;
import com.propen.resismiop.model.PenerimaMutasiModel;
import com.propen.resismiop.sevice.MutasiService;
import com.propen.resismiop.sevice.PenerimaMutasiService;

/**
 * Kelas Controller untuk Mutasi
 * 
 * @author M. Davin Ramayuda
 *
 */
@Controller
public class MutasiController {
	
	@Autowired
	private MutasiService mutasiService;

	@RequestMapping(value = "/mutasi", method = RequestMethod.GET)
	private String viewMutasi(Model model) {
		List<MutasiModel> mutasiList = mutasiService.getAllMutasi();
		model.addAttribute("mutasiList", mutasiList);
		return "mutasi";
		
	}
	
	@RequestMapping(value = "/resismiop/mutasi", method = RequestMethod.GET)
	private String lihatMutasi(Model model) {
		List<MutasiModel> mutasiList = mutasiService.getAllMutasi();
		model.addAttribute("mutasiList", mutasiList);
		return "mutasi";
		
	}

	@RequestMapping(value = "/mutasi/sknjop/{id}", method = RequestMethod.GET)
	private String sknjop(@PathVariable(value = "id") long id, Model model) {
		MutasiModel arsipMutasi = mutasiService.getMutasiById(id);
		if (arsipMutasi.getSknjopFlag() == true) {
			model.addAttribute("mutasi", arsipMutasi);
			return "sknjop";
		}else {
		return "sknjop-gagal";
		}
				
	}
	
	@RequestMapping(value = "/mutasi/sppt/{id}", method = RequestMethod.GET)
	private String detailMutasi(@PathVariable(value = "id") long id, Model model) {
		MutasiModel arsipMutasi = mutasiService.getMutasiById(id);
		model.addAttribute("mutasi", arsipMutasi);
		return "sppt";		
	}
	
	@RequestMapping(value = "/mutasi/tambah", method = RequestMethod.GET)
	private String tambahMutasi(Model model) {
		MutasiModel mutasi = new MutasiModel();
		model.addAttribute("mutasi", mutasi);
		return "form-mutasi";
	}

	@RequestMapping(value = "/mutasi/tambah", method = RequestMethod.POST)
	private String tambahMutasiSubmit(Model model, @ModelAttribute MutasiModel mutasi) {
		mutasiService.addMutasi(mutasi);
		if (mutasi.getSknjopFlag() == true) {
			return "redirect:/mutasi/sknjop/" + mutasi.getId();
		}else {
		return "redirect:/mutasi/sppt/" + mutasi.getId();
		}
	}
	
	@RequestMapping(value = "/mutasi/ubah/{id}", method = RequestMethod.GET)
	private String updateMutasi(@PathVariable(value = "id") long id, Model model) {
		MutasiModel arsipMutasi = mutasiService.getMutasiById(id);
		model.addAttribute("mutasi", arsipMutasi);
		return "update-mutasi";
	}

	@RequestMapping(value = "/mutasi/ubah/{id}", method = RequestMethod.POST)
	private String updateMutasiSubmit(Model model, @PathVariable(value = "id") long id,
			@ModelAttribute MutasiModel mutasi) {
		mutasiService.updateMutasi(mutasi);
		mutasiService.deleteMutasi(mutasiService.getMutasiById(id));
		if (mutasi.getSknjopFlag() == true) {
			return "redirect:/mutasi/sknjop/" + mutasi.getId();
		}else {
		return "redirect:/mutasi/sppt/" + mutasi.getId();
		}
	}
	
	@RequestMapping(value = "/mutasi/bayar/{id}", method = RequestMethod.GET)
	private String bayarMutasi(@PathVariable(value = "id") long id, Model model) {
		mutasiService.getMutasiById(id).setSknjopFlag(true);
		return "redirect:/mutasi/";
	}

	@RequestMapping(value = "/mutasi/hapus/{id}", method = RequestMethod.GET)
	private String deleteMutasi(@PathVariable(value = "id") long id, Model model) {
		mutasiService.deleteMutasi(mutasiService.getMutasiById(id));
		return "redirect:/mutasi/";
	}

}
