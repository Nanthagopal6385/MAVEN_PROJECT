package Com.sdp_properties;

import java.io.IOException;

public class File_Reder_Manager {
	
	public File_Reder_Manager get_Instance_FRM() {
		
		File_Reder_Manager helper = new File_Reder_Manager();
		return helper;
	}
	
	public Configuration_Reader get_Instance_CR() throws IOException {
		
		Configuration_Reader reader = new Configuration_Reader();
		
		return reader;
	}

}
