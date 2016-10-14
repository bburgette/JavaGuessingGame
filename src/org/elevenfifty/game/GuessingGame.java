package org.elevenfifty.game;

import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {

		// System.out.println(r);

		// for(int i=0; i >= 10; i++){

		play();

	}

	public static int generateNum() {
		final int r = (int) Math.ceil(Math.random() * 100);
		return r;
	}

	public static int guessInput() {

		Scanner input = new Scanner(System.in);
		int s = 0;
		while (s > 100 || s < 1) {
			System.out.println("Guess a number between 1 - 100");
			System.out.print("Enter a String -->");
			s = input.nextInt();
			if (s > 100 || s < 1) {
				System.out.println("Invalid Number Entered");
			}

		}
		return s;
	}

	public static void loop(int maxtries, int r) {
		// int maxtries = 10;
		// int r = generateNum();
		for (int i = 1; i <= maxtries; i++) {
			int s = guessInput();
			// System.out.println(s);
			if (s == r) {
				System.out.println("Winner");
				break;
			} else {
				if (s > r) {
					System.out.println("Lower");
				} else {
					System.out.println("Higher");
				}

				if (i == maxtries) {
					System.out.println("Game Over");
				} else {
					System.out.println("Try again..");
				}

			}
		}
		System.out.println("The random number is " + r);
	}

	public static void play() {
		loop(10, generateNum());
	}

}
