package com.demo.bean;

import java.sql.Date;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "policyBean02052024")
public class Policy_Registered {

	@Id
	@Column(length = 20)
	private String policyNumber;
	@Column(length = 25)
	private String fullname;
	@Column(length = 45)
	private String address;
	@Column(length = 15)
	private String mobileNumber;
	@Column(length = 30)
	private Date startDate;
	@Column(length = 30)
	private Date endDate;
	@Column(length = 20)
	private String vehicleNumber;
	@Column(length = 20)
	private String vehicleModelNumber;
	@Column(length = 30)
	private String vehicleManufacturer;
	@Column(length = 25)
	private String yearOfManufacture;
	@Column(length = 25)
	private String vehicleChassisNumber;
	@Column(length = 20)
	private String fuelType;
	@Column(length = 20)
	private String bodyType;
	@Column(length = 20)
	private String cubicCapacity;
	@Column(length = 20)
	private String vehicleColor;
	@Column(length = 25)
	private String policyReceiptNumber;
	@Column(length = 45)
	private String issuingOfficeAddress;
	@Column(length = 30)
	private String issuingOfficePhoneNumber;
	@Column(length = 30)
	private String issuingOfficeFaxNumber;
	@Column(length = 25)
	private String issuingOfficeEmail;
	@Column(length = 25)
	private String insuranceBasicAmount;
	@Column(length = 25)
	private String basicTPCoverAmount;
	@Column(length = 25)
	private String tpPremiumAmount;
	@Column(length = 25)
	private String netPremium;
	@Column(length = 25)
	private String serviceTaxOnPremium;
	@Column(length = 25)
	private String totalPayable ;
}
