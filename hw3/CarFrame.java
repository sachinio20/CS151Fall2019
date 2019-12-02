//package hw3;

import java.lang.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*; 
import java.awt.*; 
import java.awt.event.*; 
import java.awt.*; 
import javax.swing.*;
import java.awt.geom.*;

public class CarFrame extends JFrame  {
	
	public int carWidth = 100;
	private int carHeigth = 50;
	
	public CarFrame() {
		JFrame mainFrame = new JFrame();
		mainFrame.setLayout(new FlowLayout());
		 CarIcon carIcon = new CarIcon(100);
		JLabel mainLabel = new JLabel(carIcon);
		JButton zoomIn = new JButton("Zoom in");
		JButton zoomOut = new JButton("Zoom out");
		mainFrame.add(mainLabel);
		mainFrame.add(zoomIn);
		mainFrame.add(zoomOut);
		mainFrame.pack();
		mainFrame.setVisible(true);
	
		zoomIn.addActionListener(new ActionListener()
		{
		
		  public void actionPerformed(ActionEvent e)
		  {
			  carIcon.zoomIn();
			  mainLabel.repaint();
		    
		  }
		});
		
		zoomOut.addActionListener(new ActionListener()
		{
		
		  public void actionPerformed(ActionEvent e)
		  {
			 carIcon.zoomOut();
			 mainLabel.repaint();
		    
		  }
		});
		
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	
	public static void main(String [] args) {
		CarFrame t = new CarFrame();
	}
	

}
