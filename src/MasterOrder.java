import java.util.ArrayList;

public class MasterOrder {
	ArrayList<CookieOrder> order;

	// Getters and Setters
	public ArrayList<CookieOrder> getOrders() {
		return order;
	}

	public void setOrder(ArrayList<CookieOrder> order) {
		this.order = order;
	}

	// Constructor
	public MasterOrder() {
		order = new ArrayList<CookieOrder>();
	}

	// Meathods
	public CookieOrder addOrder(CookieOrder cookies) {
		order.add(cookies);
		return cookies;
	}
	public int getTotalBoxes(){
		int total = 0;
		for (CookieOrder cookieOrder : order) {
			total+= cookieOrder.getNumBoxes();
		}
		return total;
		
	}
	public int removeVariety(String removedCookies){
		int total = 0;
		for (int i = 0; i < order.size(); i++) {
		CookieOrder o = order.get(i);	
		if (o.getVariety().equals(removedCookies)) {
			total+=o.getNumBoxes();
			order.remove(o);
		}
		}
		return total;
		
		
	}
}
