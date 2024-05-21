package com.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.bean.Policy_Registered;
@Repository
public interface PolicyRepo extends JpaRepository<Policy_Registered, String> {
		public List<Policy_Registered> findBypolicyNumber(String policyNumber);
		
		

}
