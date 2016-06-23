package ch.masters.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import ch.masters.manager.TrainDepartureAdmin;
import ch.masters.model.Departure;

/**
 * 
 * GUI for the application
 * 
 * @author Chiramet Phong Penglerd, Elia Perenzin
 * @year 2016
 * @version 1.0
 */
public class SBBMasters extends JFrame{
	private static final long serialVersionUID = 1L;
	
	private JTable table;
	private JTextField time1;
	private JTextField platform;
	private JTextField time2;
	private JTextField via;
	
	private TrainDepartureAdmin trainDepartureAdmin;
	
	public SBBMasters() {
		setBounds(100,100,875,600);
		getContentPane().setLayout(new BorderLayout(0, 0));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		
		trainDepartureAdmin = new TrainDepartureAdmin();
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(new GridLayout(4, 0, 0, 0));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.add(panel_1);
		
		JButton allDepartures = new JButton("Departures");
		
		//ActionListener
		allDepartures.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				table.setModel(getDepartureTableModel(trainDepartureAdmin.getAllDepartures()));
			}
		});
		
		panel_1.add(allDepartures);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.add(panel_2);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_panel_2.rowHeights = new int[]{0, 0};
		gbl_panel_2.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);
		
		JLabel lblTime = new JLabel("Time: ");
		GridBagConstraints gbc_lblTime = new GridBagConstraints();
		gbc_lblTime.insets = new Insets(0, 0, 0, 5);
		gbc_lblTime.anchor = GridBagConstraints.EAST;
		gbc_lblTime.gridx = 1;
		gbc_lblTime.gridy = 0;
		panel_2.add(lblTime, gbc_lblTime);
		
		time1 = new JTextField();
		GridBagConstraints gbc_time1 = new GridBagConstraints();
		gbc_time1.insets = new Insets(0, 0, 0, 5);
		gbc_time1.fill = GridBagConstraints.HORIZONTAL;
		gbc_time1.gridx = 2;
		gbc_time1.gridy = 0;
		panel_2.add(time1, gbc_time1);
		time1.setColumns(10);
		
		JButton departuresByTime = new JButton("Departures by time");
		
		//ActionListener
		departuresByTime.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				table.setModel(getDepartureTableModel(trainDepartureAdmin.getDepartures(time1.getText())));
			}
		});
		
		GridBagConstraints gbc_departuresByTime = new GridBagConstraints();
		gbc_departuresByTime.insets = new Insets(0, 0, 0, 5);
		gbc_departuresByTime.gridx = 4;
		gbc_departuresByTime.gridy = 0;
		panel_2.add(departuresByTime, gbc_departuresByTime);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.add(panel_3);
		GridBagLayout gbl_panel_3 = new GridBagLayout();
		gbl_panel_3.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_3.rowHeights = new int[]{0, 0};
		gbl_panel_3.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_3.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		panel_3.setLayout(gbl_panel_3);
		
		JLabel lblPlatform = new JLabel("Platform:");
		GridBagConstraints gbc_lblPlatform = new GridBagConstraints();
		gbc_lblPlatform.insets = new Insets(0, 0, 0, 5);
		gbc_lblPlatform.anchor = GridBagConstraints.EAST;
		gbc_lblPlatform.gridx = 1;
		gbc_lblPlatform.gridy = 0;
		panel_3.add(lblPlatform, gbc_lblPlatform);
		
		platform = new JTextField();
		GridBagConstraints gbc_platform = new GridBagConstraints();
		gbc_platform.insets = new Insets(0, 0, 0, 5);
		gbc_platform.fill = GridBagConstraints.HORIZONTAL;
		gbc_platform.gridx = 2;
		gbc_platform.gridy = 0;
		panel_3.add(platform, gbc_platform);
		platform.setColumns(10);
		
		JLabel lblTime_1 = new JLabel("Time:");
		GridBagConstraints gbc_lblTime_1 = new GridBagConstraints();
		gbc_lblTime_1.insets = new Insets(0, 0, 0, 5);
		gbc_lblTime_1.anchor = GridBagConstraints.EAST;
		gbc_lblTime_1.gridx = 4;
		gbc_lblTime_1.gridy = 0;
		panel_3.add(lblTime_1, gbc_lblTime_1);
		
		time2 = new JTextField();
		time2.setColumns(10);
		GridBagConstraints gbc_time2 = new GridBagConstraints();
		gbc_time2.insets = new Insets(0, 0, 0, 5);
		gbc_time2.fill = GridBagConstraints.HORIZONTAL;
		gbc_time2.gridx = 5;
		gbc_time2.gridy = 0;
		panel_3.add(time2, gbc_time2);
		
		JButton departuresByPlatformTime = new JButton("Departures by platform and time");
		
		//ActionListener
		departuresByPlatformTime.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				table.setModel(getDepartureTableModel(trainDepartureAdmin.getPlatformDepartures(platform.getText(), time2.getText())));
			}
		});
		
		GridBagConstraints gbc_departuresByPlatformTime = new GridBagConstraints();
		gbc_departuresByPlatformTime.insets = new Insets(0, 0, 0, 5);
		gbc_departuresByPlatformTime.gridx = 7;
		gbc_departuresByPlatformTime.gridy = 0;
		panel_3.add(departuresByPlatformTime, gbc_departuresByPlatformTime);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.add(panel_4);
		GridBagLayout gbl_panel_4 = new GridBagLayout();
		gbl_panel_4.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_panel_4.rowHeights = new int[]{0, 0};
		gbl_panel_4.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_4.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		panel_4.setLayout(gbl_panel_4);
		
		JLabel lblVia = new JLabel("Via:");
		GridBagConstraints gbc_lblVia = new GridBagConstraints();
		gbc_lblVia.insets = new Insets(0, 0, 0, 5);
		gbc_lblVia.anchor = GridBagConstraints.EAST;
		gbc_lblVia.gridx = 1;
		gbc_lblVia.gridy = 0;
		panel_4.add(lblVia, gbc_lblVia);
		
		via = new JTextField();
		GridBagConstraints gbc_via = new GridBagConstraints();
		gbc_via.insets = new Insets(0, 0, 0, 5);
		gbc_via.fill = GridBagConstraints.HORIZONTAL;
		gbc_via.gridx = 2;
		gbc_via.gridy = 0;
		panel_4.add(via, gbc_via);
		via.setColumns(10);
		
		JButton btnNewButton = new JButton("Departures by via");
		
		//ActionListener
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				table.setModel(getDepartureTableModel(trainDepartureAdmin.getDeparturestToCity(via.getText())));
			}
		});
		
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton.gridx = 4;
		gbc_btnNewButton.gridy = 0;
		panel_4.add(btnNewButton, gbc_btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		getContentPane().add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable();
		table.setEnabled(false);
		scrollPane.setViewportView(table);
		
		setVisible(true);
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
	
		//Vector mit den Datensätze erstellen
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
