package hw3;

import java.awt.ItemSelectable;
import java.util.*;
public class SimpleFormatter implements InvoiceFormatter {
	
	public String formatHeader() {
		total = 0;
		String invoiceHeader = new String("<b><h1 style = 'color: green'; align = 'left' >"+ "INVOICE" + "</h1></b><br><br><br>"); 
		return invoiceHeader;
	}

	public String formatLineItem(LineItem item, HashMap<LineItem,Integer> myItems) {
		total += item.getPrice();
		return (String.format("%s: x%d $%.2f\n", item.toString(), (item.getPrice() * myItems.get(item)), myItems.get(item)));
	}

	public String formatFooter() {
		return (String.format("\n\nTOTAL DUE: $%.2f\n", total));
	}

	private double total;
}


