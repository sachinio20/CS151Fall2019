package hw3;

import java.util.*;
import javax.swing.event.*;

/**
 * An invoice for a sale, consisting of line items.
 */
public class Invoice {
	/**
	 * Constructs a blank invoice.
	 */
	public Invoice() {
		items = new HashMap<LineItem, Integer>();
		listeners = new ArrayList<>();
	}

	/**
	 * Adds an item to the invoice.
	 * 
	 * @param item the item to add
	 */
	public void addItem(LineItem item) {

		if (items.containsKey(item)) {
			items.put(item, items.get(item) + 1);
		} else {
			items.put(item, 1);
		}
		// Notify all observers of the change to the invoice
		ChangeEvent event = new ChangeEvent(this);
		for (ChangeListener listener : listeners)
			listener.stateChanged(event);
	}

	/**
	 * Adds a change listener to the invoice.
	 * 
	 * @param listener the change listener to add
	 */
	public void addChangeListener(ChangeListener listener) {
		listeners.add(listener);
	}

	/**
	 * Gets an iterator that iterates through the items.
	 * 
	 * @return an iterator for the items
	 */
	
	/*public Iterator<LineItem> getItems() {
		return new Iterator<LineItem>() {
			public boolean hasNext() {
				return current < items.size();
			}

			public LineItem next() {
				return items.get(current++);
			}

			public void remove() {
				throw new UnsupportedOperationException();
			}

			private int current = 0;
		};
	}*/

	public String format(InvoiceFormatter formatter) {
		String r = formatter.formatHeader();
		for(LineItem x : items.keySet()) {
			r += formatter.formatLineItem(x, items);
		}
		
		return r + formatter.formatFooter();
	}

	private HashMap<LineItem, Integer> items;
	private ArrayList<ChangeListener> listeners;
}
