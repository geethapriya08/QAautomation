package com.crm.config;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaseConfiguration {
	public FileInputStream fis = null;
	public Properties prop = null;
	public WebDriver wd = null;
	
	public void invokebrowser() {
		try {
			fis = new FileInputStream("src//test//resources//config.Properties");
			prop = new Properties();
			prop.load(fis);
			String br = prop.getProperty("browser");
			System.out.println("browser :"+br);
			if(br.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "src//test//resources//Drivers//chromedriver.exe");
				wd = new ChromeDriver();
			} else if(br.equalsIgnoreCase("firefox")){
				System.setProperty("webdriver.gecko.driver","src//test//resources//Drivers//geckodriver.exe");
				wd = new FirefoxDriver();
			} else if(br.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver","src//test//resources//Drivers//IEDriverServer.exe");
				wd = new InternetExplorerDriver();
			}
			wd.navigate().to(prop.getProperty("Uat_Url"));
			wd.manage().window().maximize();
			wd.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		}
		catch(Exception e){
			e.printStackTrace();
		
	}
	}

}
