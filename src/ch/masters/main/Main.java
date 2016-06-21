package ch.masters.main;

import ch.masters.utils.DataScanner;

public class Main {

	public static void main(String[] args) {
		DataScanner dataScanner = new DataScanner();
//		URL file = Main.class.getResource("resources/data/abfahrten_zhb.csv");
		dataScanner.scann("resources/data/abfahrten_zhb.csv");
	}

}
