package javahigh04.p662;

import java.io.IOException;
import java.util.Properties;

public class PropertiesEx {
	public static void main(String[] args) throws IOException {
		Properties properties = new Properties();
		
		properties.load(PropertiesEx.class.getResourceAsStream("database.properties")); // 못가져 올수도있기때문에 예외처리 필요함
		String driver = properties.getProperty("driver");
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		String admin = properties.getProperty("admin");
		
		System.out.println(driver);
		System.out.println(url);
		System.out.println(username);
		System.out.println(password);
		System.out.println(admin);
	}
}
