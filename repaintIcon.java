package lab2;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.*;
import java.awt.Graphics;
import javax.swing.*;

public class repaintIcon extends JFrame  {
	
	public static void main(String [] args) {
		JFrame mainFrame = new JFrame();
		JButton greenButton = new JButton("Repaint green");
		JButton blueButton = new JButton("Repaint blue");
		JButton redButton = new JButton("Repaint Red");
		
		
		
		CircleIcon iconToPaint = new CircleIcon(50);
		

		
		redButton.addActionListener(event -> iconToPaint.paintIconRed(iconToPaint, g, 50, 50));
		greenButton.addActionListener(event -> iconToPaint.paintIconBlue(iconToPaint, g, 50, 50));
		blueButton.addActionListener(event -> iconToPaint.paintIconBlue(iconToPaint, g, 50, 50));
		
		mainFrame.setLayout(new FlowLayout());
		
		mainFrame.add(redButton);
		mainFrame.add(blueButton);
		mainFrame.add(greenButton);
		
		
		
		
		mainFrame.pack();
		mainFrame.setVisible(true);
		
		
	}
	
	
	 
	
}
