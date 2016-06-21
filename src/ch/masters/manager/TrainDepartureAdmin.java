package ch.masters.manager;

import java.util.ArrayList;

import ch.masters.model.Departure;

public class TrainDepartureAdmin {
	
	
	/**
	 * Parse from csv into models and returns ArrayList out of Departures
	 * @return ArrayList out of Departures
	 */
	public ArrayList<Departure> getAllDepartures(){
		String line = "";
	    String cvsSplitBy = ";";
	    while ((line = br.readLine()) != null) {
	      String[] data = line.split(cvsSplitBy);
	      System.out.println(data[1]);
	    }
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
