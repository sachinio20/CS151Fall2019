package hw4;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * This program implements an animation that moves a car shape.
 */
public class hw4part2 {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		
		CarShape car1 = new CarShape(0, 0, CAR_WIDTH);
		CarShape car2 = new CarShape(0, 5, CAR_WIDTH);
		CarShape car3 = new CarShape(0, 0, CAR_WIDTH);
		CarShape car4 = new CarShape(0, 0, CAR_WIDTH);
		
		CarRunnable run1 = new CarRunnable(car1,frame);
		CarRunnable run2 = new CarRunnable(car2, frame);
		CarRunnable run3 = new CarRunnable(car3, frame);
		CarRunnable run4 = new CarRunnable(car4, frame);
		
		Thread t1 = new Thread(run1);
		Thread t2 = new Thread(run2);
		Thread t3 = new Thread(run3);
		Thread t4 = new Thread(run4);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		try {
			t1.join();
			t2.join();
			t3.join();
			t4.join();
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
		frame.pack();
		frame.setVisible(true);
		
		
		final MoveableShape shape = new CarShape(0, 0, CAR_WIDTH);
		
		ShapeIcon icon = new ShapeIcon(shape, ICON_WIDTH, ICON_HEIGHT);

		final JLabel label = new JLabel(icon);
		frame.setLayout(new FlowLayout());
		frame.add(label);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);

		final int DELAY = 30;
		// Milliseconds between timer ticks
		Timer t = new Timer(DELAY, event -> {
			shape.move();
			label.repaint();
		});
		t.start();
		
	}

	private static final int ICON_WIDTH = 400;
	private static final int ICON_HEIGHT = 100;
	private static final int CAR_WIDTH = 100;
}
