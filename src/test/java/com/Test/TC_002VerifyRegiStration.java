package com.Test;

import org.testng.annotations.Test;

import com.Utility.BaseClass;

public class TC_002VerifyRegiStration extends BaseClass {

	@Test
	public void VerifyRegis() {
		
		System.out.println("Url Succesfully get");
		System.out.println(config.getStageUrl());
		System.out.println(excel.getStringData("Sheet1", 0, 0));
	}
	
}
