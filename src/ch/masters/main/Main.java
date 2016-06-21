package ch.masters.main;

import ch.masters.manager.TrainDepartureAdmin;
import ch.masters.model.Departure;

public class Main {
	public static void main(String[] args) {
		TrainDepartureAdmin trainDepartureAdmin = new TrainDepartureAdmin();
		
		for(Departure departure : trainDepartureAdmin.getDepartures("11:32")){
			System.out.println(departure.getName());
		}
	}

}
