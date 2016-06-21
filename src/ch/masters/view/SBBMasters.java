package ch.masters.view;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JPanel;
import java.awt.GridBagConstraints;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JButton;

public class SBBMasters extends JFrame{
	private JTable table;
	private JTextField time1;
	private JTextField platform;
	
	public SBBMasters() {
		setBounds(100,100,875,600);
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(new GridLayout(4, 0, 0, 0));
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1);
		
		JButton btnNewButton = new JButton("Get all departures");
		panel_1.add(btnNewButton);
		
		JPanel panel_2 = new JPanel();
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
		
		JButton btnGetDepartures = new JButton("Get 20 Departures by time");
		GridBagConstraints gbc_btnGetDepartures = new GridBagConstraints();
		gbc_btnGetDepartures.insets = new Insets(0, 0, 0, 5);
		gbc_btnGetDepartures.gridx = 4;
		gbc_btnGetDepartures.gridy = 0;
		panel_2.add(btnGetDepartures, gbc_btnGetDepartures);
		
		JPanel panel_3 = new JPanel();
		panel.add(panel_3);
		GridBagLayout gbl_panel_3 = new GridBagLayout();
		gbl_panel_3.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panel_3.rowHeights = new int[]{0, 0};
		gbl_panel_3.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
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
		
		JLabel lblTime_1 = new JLabel("Time");
		GridBagConstraints gbc_lblTime_1 = new GridBagConstraints();
		gbc_lblTime_1.gridx = 4;
		gbc_lblTime_1.gridy = 0;
		panel_3.add(lblTime_1, gbc_lblTime_1);
		
		JPanel panel_4 = new JPanel();
		panel.add(panel_4);
		GridBagLayout gbl_panel_4 = new GridBagLayout();
		gbl_panel_4.columnWidths = new int[]{0};
		gbl_panel_4.rowHeights = new int[]{0};
		gbl_panel_4.columnWeights = new double[]{Double.MIN_VALUE};
		gbl_panel_4.rowWeights = new double[]{Double.MIN_VALUE};
		panel_4.setLayout(gbl_panel_4);
		
		JScrollPane scrollPane = new JScrollPane();
		getContentPane().add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		setVisible(true);
	}

}
