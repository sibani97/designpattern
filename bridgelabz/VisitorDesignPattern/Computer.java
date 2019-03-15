package com.bridgelabz.VisitorDesignPattern;

public class Computer implements ComputerPart {
	ComputerPart[] parts;
	

	public Computer() {
		parts=new ComputerPart[] {new Mouse(),new Monitor(),new KeyBord()};
	}


	@Override
	public void accept(ComputerPartVisitor computerpartvisitor) {
		// TODO Auto-generated method stub
		for(int i=0;i<parts.length;i++)
		{
			parts[i].accept(computerpartvisitor);
		}
		computerpartvisitor.visit(this);
		
	}
	

}
