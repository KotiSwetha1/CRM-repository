package Sample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import PomRepository.LoginPage;

public class DataDrivenFromProperties {

	public static void main(String[] args) throws Exception {
		FileInputStream fis=new FileInputStream("src\\test\\resources\\TestData\\VTiger.txt");
		Properties prop=new Properties();
		prop.load(fis);
		String value=prop.getProperty("UserName");
		System.out.println(value);
		
	}

}
