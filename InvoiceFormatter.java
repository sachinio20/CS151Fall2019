package hw3;

import java.util.*;
import java.lang.*;

public interface InvoiceFormatter {
	  
	    String formatLineItem(LineItem item, HashMap<LineItem, Integer> itemList);
	   
	   
	      String formatFooter();
	      String formatHeader();
	   }

