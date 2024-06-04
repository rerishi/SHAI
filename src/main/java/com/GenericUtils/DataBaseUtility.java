package com.GenericUtils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class DataBaseUtility {

	Connection conn = null;

	/**
	 * This method is used to get Connection with Database.
	 * 
	 * @author v.rishivsingh
	 * @throws SQLException
	 */
	public void getConnection() throws SQLException {
		Driver driverRef = new Driver();
		DriverManager.registerDriver(driverRef);
//		conn = DriverManager.getConnection(IpathConstants.DB_URL, IpathConstants.DB_Username,
//				IpathConstants.DB_Password);

	}

	/**
	 * This method is for validating data present in Database or not.
	 * 
	 * @author v.rishivsingh
	 * @param colNum
	 * @param expectedData
	 * @throws SQLException
	 */

	public String executeQueryAndGetData(int colNum, String query, String expData) throws SQLException {
		String actData = null;
		boolean flag = false;
		ResultSet result = conn.createStatement().executeQuery(query);
		while (result.next()) {
			actData = result.getString(colNum);
			if (actData.equalsIgnoreCase(expData)) {
				flag = true; // flag rising
				break;
			}
		}
		if (flag) {
			System.out.println(actData + "---> data verified");
			return expData;
		} else {
			System.out.println("data not verified");
			return "";
		}
	}

	/**
	 * This Method is to Close Connection with Database.
	 * 
	 * @author v.rishivsingh
	 * @throws SQLException
	 */
	public void disconnectDB() throws SQLException {
		conn.close();
	}

}
