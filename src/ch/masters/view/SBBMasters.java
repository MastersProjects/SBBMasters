package ch.masters.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;

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

import ch.masters.listener.SBBMastersListener;

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

		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(new GridLayout(4, 0, 0, 0));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.add(panel_1);
		
		JButton allDepartures = new JButton("Departures");
		

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
		
		JButton departuresByVia = new JButton("Departures by via");
		
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton.gridx = 4;
		gbc_btnNewButton.gridy = 0;
		panel_4.add(departuresByVia, gbc_btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		getContentPane().add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable();
		table.setEnabled(false);
		scrollPane.setViewportView(table);
		
		allDepartures.addActionListener(new SBBMastersListener(this));
		departuresByTime.addActionListener(new SBBMastersListener(this));
		departuresByPlatformTime.addActionListener(new SBBMastersListener(this));
		departuresByVia.addActionListener(new SBBMastersListener(this));
		
		setVisible(true);
	}

	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}

	public JTextField getTime1() {
		return time1;
	}

	public void setTime1(JTextField time1) {
		this.time1 = time1;
	}

	public JTextField getPlatform() {
		return platform;
	}

	public void setPlatform(JTextField platform) {
		this.platform = platform;
	}

	public JTextField getTime2() {
		return time2;
	}

	public void setTime2(JTextField time2) {
		this.time2 = time2;
	}

	public JTextField getVia() {
		return via;
	}

	public void setVia(JTextField via) {
		this.via = via;
	}
	
	
	

}
