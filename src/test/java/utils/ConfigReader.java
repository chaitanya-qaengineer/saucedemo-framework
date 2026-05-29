package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	private static Properties prop;
	
	public static void initProperties() {
		prop = new Properties();
		
		try {
			FileInputStream file = new FileInputStream(
					System.getProperty("user.dir") + "/src/test/resources/config.properties");
					
		
		prop.load(file);
		
	} catch(IOException e) {
		e.printStackTrace();
	}
}	

	public static String getBrowser() {	
		return prop.getProperty("browser");
	}
	
	public static String getUrl() {
		return prop.getProperty("url");
	}
	
	public static String getUsername() {
		return prop.getProperty("username");
	}
	
	public static String getPassword() {
		return prop.getProperty("password");
	}

}
