package com.bridgelabz.ProxyDesignPattern;

public class RealImage implements Image {
	private String filename;
	public RealImage(String filename)
	{
		this.filename=filename;
		loadFromDisk(filename);
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Display filename:"+filename);
	}
	private void loadFromDisk(String filename)
	{
		System.out.println("Loading:"+filename);
	}

}
