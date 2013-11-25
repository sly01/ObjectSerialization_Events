package com.main;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class Hakkimizda extends JFrame{

	
	public Hakkimizda() {
		
		this.setSize(200, 100);
		this.setTitle("Hakkimizda");
		
		JLabel lbl = new JLabel();
		lbl.setText("Copyright 2012 Ahmet");
	    
		this.getContentPane().add(lbl);
	    this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
	
	
}
