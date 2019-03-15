package com.bridgelabz.VisitorDesignPattern;

public interface ComputerPartVisitor {
	public void visit(Computer computer);
	public void visit(Mouse mouse );
	public void visit( KeyBord  keyBord );
	public void visit( Monitor monitor);
	

}
