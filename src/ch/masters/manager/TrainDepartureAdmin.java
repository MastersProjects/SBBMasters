package ch.masters.manager;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

import ch.masters.model.Departure;
import ch.masters.utils.DataScanner;

public class TrainDepartureAdmin {
	
	
	/**
	 * Parse from csv into models and returns ArrayList out of Departures
	 * @return ArrayList out of Departures
	 */
	public ArrayList<Departure> getAllDepartures(){
		ArrayList<Departure> departures = new ArrayList<>();
		DataScanner dataScanner = new DataScanner();
		BufferedReader br = dataScanner.getFile("resources/data/abfahrten_zhb.csv");
		
		String line = "";
	    String cvsSplitBy = ";";
	    try {
	    	br.readLine(); //skip first line
			while ((line = br.readLine()) != null) {
				Departure departure = new Departure();
				String[] data = line.split(cvsSplitBy);
				departure.setName(data[0]);
				departure.setDeparture(data[1]);
				departure.setTo(data[2]);
				departure.setVia(data[3]);
				departure.setPlatform(data[4]);	
				departures.add(departure);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	    return departures;
	}
	
	/**
	 * Get ArrayList out of max 20 Departure objects by time
	 * @param time departure time
	 * @return ArrayList out of max 20 Departure objects
	 */
	public ArrayList<Departure> getDepartures(String time){
		
	}
		
	/**
	 * Get ArrayList out of max 2 Departure objects by time and platform
	 * @param platform departure platform
	 * @param time departure time
	 * @return ArrayList out of max 2 Departure objects
	 */
	public ArrayList<Departure> getPlatformDepartures(String platform, String time){
		
	}
	
	/**
	 * Get ArrayList out of all Departure objects which via city
	 * @param city via city
	 * @return ArrayList out of Departure objects
	 */
	public ArrayList<Departure> getDeparturestToCity(String city){
		
	}
	
}
