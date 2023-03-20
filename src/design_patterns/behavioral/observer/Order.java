package design_patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Order implements Subject {

	String orderStatus;
	
	private List<Observer> observers = new ArrayList<>();
	
	@Override
	public void register(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void unRegister(Observer observer) {
		observers.remove(observer);
	}
	
	public void updateOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
		notifyObservers();
	}

	@Override
	public void notifyObservers() {
		observers.forEach(observer -> observer.updateObserver(this.orderStatus));
	}

}
