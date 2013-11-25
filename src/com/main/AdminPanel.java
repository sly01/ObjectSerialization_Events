package com.main;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.TitledBorder;

public class AdminPanel extends JFrame {
	
	
	JMenuBar mainMenuBar;
	JMenu fileMenu;
	JMenu aboutMenu;
	JMenuItem mnOpen;
	JMenuItem mnClose;
	JMenuItem mnAbout;
	
	JPanel pnl;
	
	JLabel user ;
	JLabel password;
	
	JTextField userName;
	JTextField userPassword;
	
	JButton btnLogin;
	
	public AdminPanel() {
		
		
		mainMenuBar = new JMenuBar();
		fileMenu = new JMenu("File");
		aboutMenu = new JMenu("About");
		
		mnOpen = new JMenuItem("Open");
		mnClose = new JMenuItem("Close");
		
		mnClose.addMouseListener(new MouseAdapter() {
		   
		   @Override
		public void mousePressed(MouseEvent arg0) {
			System.exit(0);
		}
		});
		
		fileMenu.add(mnOpen);
		fileMenu.add(mnClose);
		
		mnAbout = new JMenuItem("About");
		
		mnAbout.addMouseListener(new MouseAdapter() {
		
		@Override
		public void mousePressed(MouseEvent arg0) {
			Hakkimizda hk = new Hakkimizda();
			hk.setVisible(true);
		}
		
		});
		
		aboutMenu.add(mnAbout);
		
		mainMenuBar.add(fileMenu);
		mainMenuBar.add(aboutMenu);
		
		this.setJMenuBar(mainMenuBar);
		
		btnLogin = new JButton("Login");
		pnl = new JPanel();
		pnl.setBorder(new TitledBorder("Login"));
		
		user = new JLabel("user");
		password = new JLabel("password");
		userName = new JTextField(20);
		userPassword = new JTextField(20);
		
		pnl.add(user);
		pnl.add(userName);
		pnl.add(password);
		pnl.add(userPassword);
		pnl.add(btnLogin);
		
		
		
		
		this.setSize(300, 500);
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		this.getContentPane().add(pnl);

	}
	

}
