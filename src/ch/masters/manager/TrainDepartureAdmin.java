package ch.masters.manager;

import java.io.BufferedReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import ch.masters.model.Departure;
import ch.masters.utils.DataScanner;

public class TrainDepartureAdmin {

	/**
	 * Parse from csv into models and returns ArrayList out of Departures
	 * 
	 * @return ArrayList out of Departures
	 */
	public ArrayList<Departure> getAllDepartures() {
		ArrayList<Departure> departures = new ArrayList<>();
		DataScanner dataScanner = new DataScanner();
		BufferedReader br = dataScanner.getFile("resources/data/abfahrten_zhb.csv");

		String line = "";
		String cvsSplitBy = ";";
		try {
			br.readLine(); // skip first line
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
	 * 
	 * @param time
	 *            departure time
	 * @return ArrayList out of max 20 Departure objects
	 */
	public ArrayList<Departure> getDepartures(String time) {
		ArrayList<Departure> departures = new ArrayList<>();

		int counter = 0; //counter max in arraylist
		for (Departure departure : this.getAllDepartures()) {
			if (counter < 20) {
				Date inputDate = null; //input time
				Date departureDate = null; //departure time
				try {
					//Parsing to date
					departureDate = new SimpleDateFormat("HH:mm").parse(departure.getDeparture());
					inputDate = new SimpleDateFormat("HH:mm").parse(time);
				} catch (ParseException e) {
					e.printStackTrace();
				}
				//check if platform and departure date is equal or after input date
				if (inputDate.equals(departureDate) || departureDate.after(inputDate)) {
					departures.add(departure);
					counter++; //count
				}
			}
		}
		return departures;
	}

	/**
	 * Get ArrayList out of max 2 Departure objects by time and platform
	 * 
	 * @param platform
	 *            departure platform
	 * @param time
	 *            departure time
	 * @return ArrayList out of max 2 Departure objects
	 */
	public ArrayList<Departure> getPlatformDepartures(String platform, String time) {
		ArrayList<Departure> departures = new ArrayList<>();

		int counter = 0; //counter max in arraylist
		for (Departure departure : this.getAllDepartures()) {
			if (counter < 2) {
				Date inputDate = null; //input time
				Date departureDate = null; //departure time
				try {
					//Parsing to date
					departureDate = new SimpleDateFormat("HH:mm").parse(departure.getDeparture());
					inputDate = new SimpleDateFormat("HH:mm").parse(time);
				} catch (ParseException e) {
					e.printStackTrace();
				}
				//check if departure date is equal or after input date
				if (platform.equals(departure.getPlatform()) && (inputDate.equals(departureDate) || departureDate.after(inputDate))) {
					departures.add(departure);
					counter++; //count
				}
			}
		}
		return departures;
	}

	/**
	 * Get ArrayList out of all Departure objects which via city
	 * 
	 * @param city
	 *            via city
	 * @return ArrayList out of Departure objects
	 */
	public ArrayList<Departure> getDeparturestToCity(String city) {
		ArrayList<Departure> departures = new ArrayList<>();
		for (Departure departure : this.getAllDepartures()) {
			if (departure.getVia().contains(city)) {
				departures.add(departure);
			}
		}
		return departures;
	}

}
