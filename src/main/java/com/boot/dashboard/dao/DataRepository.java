package com.boot.dashboard.dao;

import org.springframework.data.repository.CrudRepository;

import com.boot.dashboard.entity.DashboardData;

public interface DataRepository extends CrudRepository<DashboardData, Integer>{
	
}
