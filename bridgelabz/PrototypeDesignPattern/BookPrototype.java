package com.bridgelabz.PrototypeDesignPattern;

public class BookPrototype {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		BookShop bookshop=new BookShop();
		BookShop bookshop1=(BookShop) bookshop.clone();
		bookshop.setShopname("ananda");
		 bookshop1.setShopname("desh");
		//add all the book
		bookshop.loadBook();
		System.out.println(bookshop);
		System.out.println( bookshop1);
		

	}

}
