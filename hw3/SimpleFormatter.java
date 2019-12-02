//package hw3;

import java.awt.ItemSelectable;
import java.util.*;
public class SimpleFormatter implements InvoiceFormatter {
	
	public String formatHeader() {
		 total = 0;
		        return "     I N V O I C E\n\n\n";
	}

	public String formatLineItem(LineItem item, HashMap<LineItem,Integer> myItems) {
		total += item.getPrice() * myItems.get(item);
		return (String.format("%s: x%d $%.2f\n", item.toString(),myItems.get(item) ,(item.getPrice() * myItems.get(item))));
	}

	public String formatFooter() {
		return (String.format("\n\nTOTAL DUE: $%.2f\n", total));
	}

	private double total;
}


