package com.bridgelabz.MediatorDesignPattern;

public class MediatorPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User robert=new User("Robert");
		User tem=new User("Tem");
		robert.sendMessage("Hi! tem");
		tem.sendMessage("hello! robert");

	}

}
