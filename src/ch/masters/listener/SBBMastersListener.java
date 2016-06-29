package ch.masters.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import ch.masters.manager.TrainDepartureAdmin;
import ch.masters.model.Departure;
import ch.masters.utils.ValidationChecker;
import ch.masters.view.SBBMasters;

/**
 * ActionListener for the SBBMasters View
 * @author Chiramet Phong Penglerd, Elia Perenzin
 * @year 2016
 * @version 1.0
 */
public class SBBMastersListener implements ActionListener{

	private SBBMasters sbbMasters;
	private TrainDepartureAdmin trainDepartureAdmin;
	private ValidationChecker validationChecker;
	
	public SBBMastersListener(SBBMasters sbbMasters) {
		this.sbbMasters = sbbMasters;		
		trainDepartureAdmin = new TrainDepartureAdmin();
		validationChecker = new ValidationChecker();
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		//Button Departure
		if(arg0.getActionCommand().equals("Departures")){
			sbbMasters.getTable().setModel(getDepartureTableModel(trainDepartureAdmin.getAllDepartures()));
			emptyTextFields();
			
		//Button Departure by time
		}else if(arg0.getActionCommand().equals("Departures by time")){
			
			//Validation check
			if(validationChecker.checkTimeFormat(sbbMasters.getTime1().getText())){
				sbbMasters.getTable().setModel(getDepartureTableModel(trainDepartureAdmin.getDepartures(sbbMasters.getTime1().getText())));
				emptyTextFields();
			}else{
				JOptionPane.showMessageDialog(sbbMasters, "Zeitformat ung\u00fcltig", "Error", JOptionPane.ERROR_MESSAGE);
			}
			
		//Button Departure by platform and time
		}else if(arg0.getActionCommand().equals("Departures by platform and time")){
			
			//Validation check
			if(!validationChecker.checkEmpty(sbbMasters.getPlatform().getText()) && validationChecker.checkTimeFormat(sbbMasters.getTime2().getText())){
				sbbMasters.getTable().setModel(getDepartureTableModel(trainDepartureAdmin.getPlatformDepartures(sbbMasters.getPlatform().getText(), sbbMasters.getTime2().getText())));
				emptyTextFields();
			} else {
				JOptionPane.showMessageDialog(sbbMasters, "Gleis oder Zeitformat ung\u00fcltig", "Error", JOptionPane.ERROR_MESSAGE);
			}
			
		//Button Departure by via
		}else if(arg0.getActionCommand().equals("Departures by via")){
			
			//Validation check
			if(!validationChecker.checkEmpty(sbbMasters.getVia().getText())){
				sbbMasters.getTable().setModel(getDepartureTableModel(trainDepartureAdmin.getDeparturestToCity(sbbMasters.getVia().getText())));
				emptyTextFields();
			}else{
				JOptionPane.showMessageDialog(sbbMasters, "Via darf nicht leer sein", "Error", JOptionPane.ERROR_MESSAGE);
			}
		}
		
	}
	
	
	/**
	 * Function for empty the TextFields
	 */
	private void emptyTextFields(){
		sbbMasters.getTime1().setText("");
		sbbMasters.getTime2().setText("");
		sbbMasters.getPlatform().setText("");
		sbbMasters.getVia().setText("");
	}
	
	
	/**
	 * Creates TableModel for departures Table
	 * @param departures
	 * @return TableModel
	 */
	private TableModel getDepartureTableModel(ArrayList<Departure> departures){
		/*
		 * Model for JTables
		 */
		//Vector mit den Titeln erstellen
		Vector<String> columnNames = new Vector<String>();
		columnNames.addElement("Line");
		columnNames.addElement("Departure Time");
		columnNames.addElement("To");
		columnNames.addElement("Via");
		columnNames.addElement("Platform");
	
		//Vector mit den Datens�tze erstellen
		@SuppressWarnings("rawtypes")
		Vector<Vector> data = new Vector<Vector>();
		
		//erstellt ein Vector mit den Noten
		for(Departure departure : departures){
			
			Vector<Object> row = new Vector<Object>();
				
			row.addElement(departure.getName());	
			row.addElement(departure.getDeparture());
			row.addElement(departure.getTo());
			row.addElement(departure.getVia());
			row.addElement(departure.getPlatform());
			
			data.addElement(row);						
		}
		
		//Tabel Model erstellen
		TableModel model = new DefaultTableModel(data, columnNames);
		return model;
	}

}
