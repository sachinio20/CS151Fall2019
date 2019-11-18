package hw4;

import java.util.concurrent.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import javax.swing.Timer;


public class CarRunnable implements Runnable {
	
	
	public CarShape MovingCar;
	public JFrame frame;
	private static final int ICON_WIDTH = 400;
	private static final int ICON_HEIGHT = 100;
	private static final int CAR_WIDTH = 100;
	public final int DELAY = 1;
	
	public CarRunnable(CarShape myCar, JFrame myFrame) {
		this.MovingCar = myCar;
		this.frame = myFrame;
	}
	
	public void run() {
		
		try {
			final int DELAY = (int) (Math.random() * (200-50) +50);
			final MoveableShape shape = this.MovingCar;
			ShapeIcon icon = new ShapeIcon(shape, ICON_WIDTH, ICON_HEIGHT);
			JLabel label = new JLabel(icon);
			this.frame.add(label);
			this.frame.setLayout(new GridLayout(2,3));
			this.frame.pack();
			this.frame.setVisible(true);
			
			
			Timer t = new Timer(DELAY, event -> {
				this.MovingCar.move();
				label.repaint();

			});
			t.start();
			Thread.sleep(DELAY);
		}
		catch(Exception ex){
			System.out.println(ex.getLocalizedMessage());
		}
	}

}
