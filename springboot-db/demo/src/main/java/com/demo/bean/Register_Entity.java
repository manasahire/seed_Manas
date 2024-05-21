package com.demo.bean;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "P1Bean01052024")
public class Register_Entity {
	
		@Id
		@Column(length = 12)
		private  String mobno;
		@Column(length = 15)
		private String first_Name;
		@Column(length = 15)
		private String middle_Name;
		@Column(length = 15)
		private String last_Name;
		@Column(length = 40)
		private String image_Src;
		@Column(length = 40)
		private String email;
		@Column(length = 20)
		private String password;
}