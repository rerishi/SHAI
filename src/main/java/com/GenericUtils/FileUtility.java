package com.GenericUtils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class FileUtility {
	/**
	 * This method is used to Read Data From Properties File
	 * 
	 * @author v.rishivsingh
	 * @param key
	 * @return
	 * @throws Throwable
	 */

	public String readDataFromPropertyFile(String key) throws Throwable {
		FileInputStream fisP = new FileInputStream(IpathConstants.FilePath);
		Properties p = new Properties();
		p.load(fisP);
		String value = p.getProperty(key);
		return value;

	}
	
	/**
	 * This method is used to Read Data From Test Data Properties File
	 * 
	 * @author v.rishivsingh
	 * @param key
	 * @return
	 * @throws Throwable
	 */
	public String readTestDataFromPropertyFile(String key) throws Throwable {
		FileInputStream fisP = new FileInputStream(IpathConstants.TestDataFilePath);
		Properties p = new Properties();
		p.load(fisP);
		String value = p.getProperty(key);
		return value;

	}

	/**
	 * This method is used to Write Data into Properties File
	 * 
	 * @author v.rishivsingh
	 * @param key
	 * @param value
	 * @throws Throwable
	 */
	public void writeDataToPropertyFile(String key, String value) throws Throwable {
		FileInputStream fisP = new FileInputStream(IpathConstants.FilePath);
		Properties p = new Properties();
		p.load(fisP);
		p.setProperty(key, value);

		FileOutputStream fiso = new FileOutputStream(IpathConstants.FilePath);
		p.store(fiso, "updated");
	}

}
