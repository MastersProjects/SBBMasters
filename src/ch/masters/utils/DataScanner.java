package ch.masters.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DataScanner {

	public void scann(String fileName) {
		BufferedReader br;
		String line = "";
		String cvsSplitBy = ";";
		
		try {
			br = new BufferedReader(new FileReader(fileName));
			while ((line = br.readLine()) != null) {
				String[] data = line.split(cvsSplitBy);
				System.out.println(data[1]);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
