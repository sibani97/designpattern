package com.bridgelabz.ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	private int state;
	private List<Observer> observers=new ArrayList<Observer>();

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
		notifyAllObserver();
	}
	public void notifyAllObserver() {
		for(Observer observer:observers)
		{
			observer.update();
		}
		
	}
	public void deattach(Observer observer)
	{
		observers.remove(observer);
	}
	public void attach(Observer observer)
	{
		observers.add(observer);
	}
	

}
