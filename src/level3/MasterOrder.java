package level3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Predicate;

public class MasterOrder {
	ArrayList<CookieOrder> Order = new ArrayList<CookieOrder>();

	public void addOrder(CookieOrder c) {
		Order.add(c);

	}
//go to helpdeskcorprate.com
	public ArrayList<CookieOrder> getOrder() {
		return Order;
	}

	public void setOrder(ArrayList<CookieOrder> order) {
		Order = order;
	}

	public Object getTotalBoxes() {
		int numOfOrder = 0;
		for (CookieOrder cookieOrder : Order) {
			numOfOrder += cookieOrder.getNumBoxes();
		}
		return numOfOrder;
	}

	public int removeVariety(String string) {
		int removedOrders = 0;
		Order.iterator();
		Iterator<CookieOrder> bob = Order.iterator();
		while(bob.hasNext()){
			CookieOrder test = bob.next();
			if (test.getVariety().equals(string)) {
				removedOrders +=test.getNumBoxes();
				bob.remove();
			}
		}
		return removedOrders;
		
	
	}
}
