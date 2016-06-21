package ch.masters.main;

import ch.masters.manager.TrainDepartureAdmin;
import ch.masters.model.Departure;
import ch.masters.utils.DataScanner;

public class Main {

	public static void main(String[] args) {
		TrainDepartureAdmin trainDepartureAdmin = new TrainDepartureAdmin();
		
		for(Departure departure : trainDepartureAdmin.getAllDepartures()){
			System.out.println(departure.getName());
		}
	}

}
