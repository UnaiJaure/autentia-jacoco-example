package com.autentia.tutorial;

public class Autentia {

	public void tellMeSometing(int i) {
		if (i < 5) {
			System.out.println("Lower than 5. Soy menor que cinco");
			return;
		}

		if (i % 2 == 0) {
			System.out.println("Even number. Soy un numero par");
			return;
		}
	}
}
