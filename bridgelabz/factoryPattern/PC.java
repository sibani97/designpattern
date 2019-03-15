package com.bridgelabz.factoryPattern;

public class PC implements Computer{
	private String RAM;
	private String HDD;
	private String CPU;
	public PC(String ram,String hdd,String cpu) {
		this.RAM=ram;
		this.CPU=cpu;
		this.HDD=hdd;
		
	}
	@Override
	public String getRAM() {
		// TODO Auto-generated method stub
		return this.RAM;
	}
	@Override
	public String toString() {
		return "PC [RAM=" + RAM + ", HDD=" + HDD + ", CPU=" + CPU + "]";
	}
	@Override
	public String getHDD() {
		// TODO Auto-generated method stub
		return this.HDD;
	}
	@Override
	public String getCPU() {
		// TODO Auto-generated method stub
		return this.CPU;
	}
	
}
