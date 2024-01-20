package com.boot.dashboard.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.dashboard.dao.DataRepository;
import com.boot.dashboard.entity.DashboardData;

@Service
public class DashboardService {
	@Autowired
	private DataRepository dataRepository;
	
	public List<DashboardData> getAllData() {
		List<DashboardData> dd = (List<DashboardData>) this.dataRepository.findAll();
		return dd;
	}
	
	public DashboardData getDataById(int id) {
		Optional<DashboardData> d= this.dataRepository.findById(id);
		return d.get();
	}
}
