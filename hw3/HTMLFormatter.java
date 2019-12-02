package hw3;

import java.util.HashMap;

public class HTMLFormatter implements InvoiceFormatter {
	
	
	public String formatHeader() {
		
	total = 0;
	 String invoiceHeader = new String("<b><h1 style = 'color:blue'; align = 'center'>" + "I N V O I C E" + "</h1></b><br>");
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
