package com.bridgelabz.factoryPattern;

public class ComputerClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Computer pc=ComputerFactory.createComputer(ComputerType.PC,"1GB","256GB","Intel Core 2 Duo");
Computer server=ComputerFactory.createComputer(ComputerType.Server,"32GB","1TB","AMD Ryzen 7 2700X");
Computer supercomputer=ComputerFactory.createComputer(ComputerType.SUPERCOMPUTER,"32GB","1TB","AMD Ryzen 7 2700X");
System.out.println(pc);
System.out.println(server);
System.out.println(supercomputer);
	}

}
