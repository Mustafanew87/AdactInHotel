package org.maven.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigReader {

	String fileName = System.getProperty("user.dir")
			+ "\\src\\recourse\\java\\com\\maven\\lib\\Configuration.properties";

	static Properties prop = null;

	public ConfigReader() throws Throwable {
		try {
			File f = new File(fileName);

			FileInputStream fin = new FileInputStream(f);

			prop = new Properties();

			prop.load(fin);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception();
		}

	}

	public String getBrowserName() throws Exception {
		String property = prop.getProperty("browserName");
		if (property.equals(null)) {
			throw new Exception("Browsernane is invalid");
		}
		return property;

	}

	public String getURL() throws Exception {
		String property = prop.getProperty("URL");
		if (property.equals(null)) {
			throw new Exception("URL is invalid");
		}
		return property;

	}

	public String getimplicitWait() throws Exception {
		String property = prop.getProperty("implicitWait");
		if (property.equals(null)) {
			throw new Exception("implicitWait is invalid");
		}
		return property;

	}
}
