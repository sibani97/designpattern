package com.bridgelabz.factoryPattern;

public class ComputerFactory {
	public static Computer createComputer(ComputerType type,String ram,String hdd,String cpu)
	{
		Computer computer=null;
		switch (type) {
		case PC:
			computer=new PC(ram,hdd,cpu);
			break;

		case Server:
			computer=new Server(ram, hdd, cpu);
			break;
		case SUPERCOMPUTER:
			computer=new SuperComputer();
		}
		return computer;
	}

}
