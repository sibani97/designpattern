package com.bridgelabz.ObserverDesignPattern;

public class ObserverPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subject subject=new Subject();
		Observer hexaobserver=new HexaObserver(subject);
		new Octalobserver(subject);
		new BinaryObserver(subject);
		
		System.out.println("\nFirst state change:15");
		subject.setState(15);
		
		System.out.println("\nSecond state change:10");
		subject.setState(10);
		
		subject.deattach(hexaobserver);
		System.out.println("\nThird state change:5");
		subject.setState(5);

	}

}
