package com.boot.dashboard.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.boot.dashboard.entity.DashboardData;
import com.boot.dashboard.service.DashboardService;

@Controller
public class HomeController {
	@Autowired
	private DashboardService dashboardService;
	
	@GetMapping("/data")
	public String home(Model model) {
		List<DashboardData> allData = this.dashboardService.getAllData();
		model.addAttribute("allData", allData);
		return "home";
	}
	
	@GetMapping("/data/{id}")
	public String getDataById(@PathVariable("id") int id, Model model) {
		DashboardData data = this.dashboardService.getDataById(id);
		model.addAttribute("data", data);
		System.out.println(data);
		return "home";
	}
	
}
