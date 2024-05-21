package com.demo.controller;


import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.demo.dao.PolicyRepo;
import com.demo.dao.RegisterRepo;
import com.demo.service.UserService;

import com.demo.bean.Policy_Registered;
import com.demo.bean.Register_Entity;

@RestController
@RequestMapping("/Register")
@CrossOrigin(origins = "http://localhost:3000")

public class CustomerControler {
	@Autowired
	RegisterRepo repo;
	@Autowired
	PolicyRepo prap;
	@Autowired
	private UserService userService;
	
	@PostMapping("/addRegisterDetailBean")
	public void addRegister_Entity(@RequestBody Register_Entity cbean) {
		repo.save(cbean);
	}
	
	@PostMapping("/AddPolicy")
	public void addPolicy_Registered(@RequestBody Policy_Registered pbean) {
		prap.save(pbean);
	}
	
	@GetMapping("/getallRegister")
	public List<Register_Entity> fetchAllReg() {
		
		return repo.findAll();
	}
	
	@GetMapping("/getallPolicy")
	public List<Policy_Registered> fetchAllPolicy() {
		return prap.findAll();
	}
	
	
	@GetMapping("/byId/{Mobno}")
	public List<Register_Entity> getByMobno(@PathVariable String Mobno) {
		return repo.findByMobno(Mobno);
	}
	
	@GetMapping("User/{username}/{password}")
	   public String UserLogin(@PathVariable("username") String username, @PathVariable("password") String password) {
	       String flag = UserService.loginValidation(username, password);
	       if (flag == "error") {
	           return " false " ;
	       }
	       return flag;
	   }
	
//	@GetMapping("/byRange/{min}/{max}")
//	public List<CustomerDetailBean> getByRange(@PathVariable double min, @PathVariable double max) {
//		return repo.findBy(min, max);
//	}
	
}
