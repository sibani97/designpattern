package com.bridgelabz.ProxyDesignPattern;

public class ProxyImage implements Image{
	private RealImage realimage;
	private String filename;
	@Override
	public void display() {
		// TODO Auto-generated method stub
		if(realimage==null)
		{
			realimage=new RealImage(filename);
		}
		realimage.display();
	}
	public ProxyImage(String filename) {
		
		this.filename = filename;
	}
	
	

}
