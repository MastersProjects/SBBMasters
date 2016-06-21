package ch.masters.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

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
	 * {@link DataScanner.parse(ArrayList) parse}
	 * 
	 * @param file
	 */
	public void scann(String file) {
		BufferedReader br;
		String line = "";
		String cvsSplitBy = ";";

		try {
			br = new BufferedReader(new FileReader(file));
			while ((line = br.readLine()) != null) {
				String[] data = line.split(cvsSplitBy);
				System.out.println(data[1]);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	//TODO implementation and documentation
	public ArrayList<Departure> parse (ArrayList<String> data){
		return null;
		
	}
}
