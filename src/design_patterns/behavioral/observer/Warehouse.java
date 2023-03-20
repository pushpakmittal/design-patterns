package design_patterns.behavioral.observer;

public class Warehouse implements Observer {

	String orderStatus;
	
	@Override
	public void updateObserver(String orderStatus) {
		this.orderStatus = orderStatus;
		getOrderStatus();
	}

	@Override
	public void getOrderStatus() {
		System.out.println(this.orderStatus);
	}

}
