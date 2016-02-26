package level3;

import java.util.ArrayList;

public class MasterOrder {
ArrayList<CookieOrder> Order = new ArrayList<CookieOrder>();
public void AddOrder(CookieOrder c){
	Order.add(c);
	
}

public ArrayList<CookieOrder> getOrder() {
	return Order;
}

public void setOrder(ArrayList<CookieOrder> order) {
	Order = order;
}
}
