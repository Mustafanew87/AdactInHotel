package org.maven.helper;

public class FileReaderManager {

	private FileReaderManager() {
		// TODO Auto-generated constructor stub
	}

	public static FileReaderManager fm = new FileReaderManager();

	public ConfigReader cr = null;

	public static FileReaderManager getInstance() {
		return fm;
	}

	public ConfigReader getConfigReader() throws Throwable {
		if (cr == null) {
			cr = new ConfigReader();
		}
		return cr;
	}

}
