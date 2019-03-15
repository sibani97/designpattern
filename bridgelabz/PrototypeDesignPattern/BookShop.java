package com.bridgelabz.PrototypeDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable {
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		BookShop shop=new BookShop();
		for(Book book:this.getBooks()) {
			shop.getBooks().add(book);
		}
		return shop;
	}
	public String shopname;
	List<Book> books=new ArrayList<>();
	public String getShopname() {
		return shopname;
	}
	public void setShopname(String shopname) {
		this.shopname = shopname;
	}
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	@Override
	public String toString() {
		return "BookShop [shopname=" + shopname + ", books=" + books + "]";
	}
	public void loadBook()
	{
		for(int i=0;i<=10;i++)
		{
			Book book=new Book();
			book.setBookid(i);
			book.setBookname("book"+i);
			getBooks().add(book);
		}
	}
	

}
