package com.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.bean.Register_Entity;

@Repository
public interface RegisterRepo extends JpaRepository<Register_Entity, String> {
	public List<Register_Entity> findByMobno(String Mobno);
	
	}
