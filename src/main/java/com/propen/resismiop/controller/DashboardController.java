package com.propen.resismiop.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.Model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.propen.resismiop.model.DashboardModel;
import com.propen.resismiop.model.UserRoleModel;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.propen.resismiop.sevice.AppraisalService;
import com.propen.resismiop.sevice.DashboardService;

@Controller
//@RequestMapping(value = "/dashboard")
public class DashboardController {
	@Autowired
	private DashboardService dashboardService;
    @RequestMapping(value = "/dashboard", method = RequestMethod.GET)
    public String viewDashboard(Model model) {
		List<DashboardModel> dashboardpbb = dashboardService.getAllPBB();
		Long totalpbb = 0L;
		for(DashboardModel m : dashboardpbb ) {
			
		 totalpbb = m.getSetorpbb() + totalpbb;
		}
		model.addAttribute("dashboard", totalpbb);
		
		return "dashboard";
    }
    @RequestMapping(value = "/dashboard-pbb", method = RequestMethod.GET)
    public String dashboardPBB() {
        return "dashboard-pbb";
    }
}