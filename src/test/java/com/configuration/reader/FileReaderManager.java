package com.configuration.reader;

public class FileReaderManager {
	
	public static FileReaderManager getInstance() {
		FileReaderManager helper=new FileReaderManager();
		return helper;

	}
	
	
	public ConfigurationReader getInstanceCr() throws Throwable {
		ConfigurationReader reader=new ConfigurationReader(); 
      return reader;
	}
	

}
