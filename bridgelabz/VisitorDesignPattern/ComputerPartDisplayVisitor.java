package com.bridgelabz.VisitorDesignPattern;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor{

	@Override
	public void visit(Computer computer) {
		// TODO Auto-generated method stub
		System.out.println("Displaying computer:");
		
	}

	@Override
	public void visit(Mouse mouse) {
		// TODO Auto-generated method stub
		System.out.println("Displaying mouse:");
	}

	@Override
	public void visit(KeyBord keyBord) {
		// TODO Auto-generated method stub
		System.out.println("Displaying keybord:");
	}

	@Override
	public void visit(Monitor monitor) {
		// TODO Auto-generated method stub
		System.out.println("Displaying monitor:");
	}

}
