package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {
	

	public static Properties config() throws IOException {
		Properties properties= new Properties();;
		String filepath = "C:\\Users\\jiten\\git\\Test-Project\\CucumberJava\\src\\test\\resources\\Properties\\config.properties";
		FileInputStream instm = new FileInputStream(filepath);
		properties.load(instm);
		return properties;
	}
	public static String getLogInUrl() throws IOException{
		return config().getProperty("login_url");
	}
}
