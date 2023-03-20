package design_patterns.behavioral.observer;

public class Runner {
	
	public static void main(String[] args) {
		
		Order order = new Order();
		Observer buyer = new Buyer();
		Observer seller = new Seller();
		Observer warehouse = new Warehouse();
		
		order.register(warehouse);
		order.register(seller);
		order.register(buyer);
		
		order.updateOrderStatus("created");
		
		order.updateOrderStatus("delivered");
		
		buyer.getOrderStatus();
		
	}
}
