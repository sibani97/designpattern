package com.bridgelabz.ObserverDesignPattern;

public class Octalobserver extends Observer {
	public Octalobserver(Subject subject)
	{
		this.subject=subject;
		this.subject.attach(this);
		
	}
	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("Octal String:"+Integer.toOctalString(subject.getState()));
	}
	

}
