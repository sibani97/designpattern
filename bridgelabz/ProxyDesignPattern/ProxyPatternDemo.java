package com.bridgelabz.ProxyDesignPattern;

public class ProxyPatternDemo {
	public static void main(String []args)
	{
		Image image=new ProxyImage("pic_10mb.jpg");
		image.display();
		System.out.println();
		image.display();
	}

}
