package com.javacourse.carmotormain;

public class motor {

	private String name;
	private int beygirGücü;
	
	public motor(String name, int beygirGücü) {
		
		this.name = name;
		this.beygirGücü = beygirGücü;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBeygirGücü() {
		return beygirGücü;
	}

	public void setBeygirGücü(int beygirGücü) {
		this.beygirGücü = beygirGücü;
	}
		

	public void start() {
		System.out.println("MOTOR ÇALIÞTIRILIYOR.");
	}

}
