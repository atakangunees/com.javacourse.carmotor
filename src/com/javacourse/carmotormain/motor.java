package com.javacourse.carmotormain;

public class motor {

	private String name;
	private int beygirG�c�;
	
	public motor(String name, int beygirG�c�) {
		
		this.name = name;
		this.beygirG�c� = beygirG�c�;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBeygirG�c�() {
		return beygirG�c�;
	}

	public void setBeygirG�c�(int beygirG�c�) {
		this.beygirG�c� = beygirG�c�;
	}
		

	public void start() {
		System.out.println("MOTOR �ALI�TIRILIYOR.");
	}

}
