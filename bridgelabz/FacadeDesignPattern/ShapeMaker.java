package com.bridgelabz.FacadeDesignPattern;

public class ShapeMaker {
	private Shape rectanle;
	private Shape square;
	private Shape circle;
	public ShapeMaker()
	{
		rectanle=new Rectangle();
		square=new Square();
		 circle=new Circle();
	}
	public void drawCircle()
	{
		circle.draw();
	}
	public void drawSquare()
	{
		square.draw();
	}
	public void drawRectangle()
	{
		rectanle.draw();
	}

}
