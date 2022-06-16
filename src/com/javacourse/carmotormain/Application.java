package com.javacourse.carmotormain;

public class Application {

	public static void main(String[] args) {
		
		motor motor1 = new motor("Renault",1200);
		araba araba1 = new araba("Mercedes",2020,motor1);
		
	   motor1.start();

		
	}

}
