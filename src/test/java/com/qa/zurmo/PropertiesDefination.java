package com.qa.zurmo;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
public class PropertiesDefination {

	public static Properties prop;
	
	public PropertiesDefination () throws IOException{
	prop = new Properties();
	FileInputStream fis = new FileInputStream("E:\\Java\\src\\practice\\locators.properties");
	prop.load(fis);
		}
	}

