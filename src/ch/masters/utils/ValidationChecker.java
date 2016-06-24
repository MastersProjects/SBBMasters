package ch.masters.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * A class for checking validations
 * 
 * @author Chiramet Phong Penglerd, Elia Perenzin
 * @year 2016
 * @version 1.0
 */
public class ValidationChecker {
	
	
	/**
	 * Check if string is empty
	 * @param string String
	 * @return boolean if string is empty
	 */
	public boolean checkEmpty(String string){
		String preparedString = string.replace(" ", "");
		if(preparedString.equals("")){
			return true;
		}else{
			return false;
		}
	}
	
	
	/**
	 * Check if string has the right time format (HH:mm)
	 * @param string String
	 * @return boolean if string has the right format
	 */
	public boolean checkTimeFormat(String string){
		try {
			//Parsing to date
			new SimpleDateFormat("HH:mm").parse(string);
			return true;
		} catch (ParseException e) {
			e.printStackTrace();
			return false;			
		}
	}
}
