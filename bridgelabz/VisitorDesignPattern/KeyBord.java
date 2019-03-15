package com.bridgelabz.VisitorDesignPattern;

public class KeyBord implements ComputerPart{

	@Override
	public void accept(ComputerPartVisitor computerpartvisitor) {
		// TODO Auto-generated method stub
		computerpartvisitor.visit(this);
		
	}

}
