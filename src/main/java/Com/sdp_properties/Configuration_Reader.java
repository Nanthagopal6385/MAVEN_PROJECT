package Com.sdp_properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader {
	
	public String get_config_url() throws IOException {
		
		File f = new File("C:\\Users\\ADMIN\\eclipse-workspace\\March22_PB\\configuration.properties");
		FileInputStream fis = new FileInputStream(f);
		Properties p = new Properties();
		p.load(fis);
		String url = p.getProperty("url");
		return url;
		}
	public String get_config_email() throws IOException {
		
        File f = new File("C:\\Users\\ADMIN\\eclipse-workspace\\March22_PB\\configuration.properties");
		
		FileInputStream fis = new FileInputStream(f);
		Properties p = new Properties();
		p.load(fis);
		String email = p.getProperty("email");
		return email;
	}
	
	public String get_config_password() throws IOException {
        File f = new File("C:\\Users\\ADMIN\\eclipse-workspace\\March22_PB\\configuration.properties");
		
		FileInputStream fis = new FileInputStream(f);
		Properties p = new Properties();
		p.load(fis);
		
		String password = p.getProperty("password");
		return password;
		

	}
	
	
	

}
