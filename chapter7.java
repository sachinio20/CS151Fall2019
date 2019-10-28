package lab3;


import java.util.*;
import java.lang.*;

import javax.swing.*;
import java.awt.*;


public class chapter7 {
	
	public static void dumpArray(Object[] myArr) {
		
		for(int i = 0; i < myArr.length;i++) {
			if(myArr[i].getClass() != Integer.class || myArr[i].getClass() != Double.class || myArr[i].getClass() != Float.class
					|| myArr[i].getClass() != Byte.class || myArr[i].getClass() != Long.class || myArr[i].getClass() != Boolean.class || myArr[i].getClass() != Short.class
					|| myArr[i].getClass() != Short.class ) {
				
				System.out.println(myArr[i]);
				
			}
			else {
				System.out.println(myArr[i].toString());
			}
		} 
		
	}
	
	
	public static void main(String [] args) {
		
		long myLong = 47292983;
		short myShort = 4444;
		JButton jB = new JButton("YOOOO");
		Rectangle myR = new Rectangle(20,40);
		
		Object[] myArr = {1,4.5,"hello", true, 'c', myLong,  myShort, jB, myR};
		
		dumpArray(myArr);
	}

}
