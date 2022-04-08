package com.Utility;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {
	Properties pro;
	
	public  ConfigDataProvider() throws Exception {
		String path="C:\\Users\\Windows\\eclipse-workspace\\BankingDomain\\Config\\Config.Properties";
		FileInputStream fis=new FileInputStream(path);
	    pro= new Properties();
		pro.load(fis);
	}
public String getStageUrl() {
	
	return pro.getProperty("StageUrl");
	
}
	public String getLiveUrl() {
		return pro.getProperty("LiveUrl");
	}
	
}
