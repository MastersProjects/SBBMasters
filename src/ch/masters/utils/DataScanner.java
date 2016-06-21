package ch.masters.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import ch.masters.model.Departure;

/**
 * 
 * @description Parser for the data. Data comes from the csv file and is going
 *              to be parsed into the model {@link Departure Departure}
 * @author Elia Perenzin, Chiramet Phong Penglerd
 * @year 2016
 * @version 1.0
 */
public class DataScanner {

	/**
	 * Scanner for the csv file. Reads the file and calls the parser function
	 * {@link TrainDepartureAdmin.getAllDepartures(BufferdReader) parse}
	 * 
	 * @param file
	 */
	public BufferedReader getFile(String file) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(file));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return br;
	}
}
