package com.coderscampus;

import java.util.Random;
import java.util.Scanner;



public class Assignment2App {

	public static void main(String[] args) {
		
		Scanner userNum = new Scanner(System.in);
		boolean userWon = false;
		int userGuesses = 0;
		
		Random random = new Random();
		int numGuess = random.nextInt(100)+1;
		
		while(userGuesses < 5) {
			System.out.println("Please pick a number between 1 and 100: ");
			int userGuess = userNum.nextInt();
			
			if(userGuess < 1 || userGuess > 100) {
				System.out.println("Your is not between 1 and 100, please make another guess.");
			} else if (userGuess < numGuess) {
				System.out.println("Please pick a higher number");
				userGuesses++;
			} else if (userGuess > numGuess) {
				System.out.println("Please pick a lower number");
				userGuesses++;
			} else {
				userWon = true;
				break;
			}
		}
		if(userWon) {
			System.out.println("you win!!");
		}else {
			System.out.println("You loose");
			System.out.println("The number to guess was:" + numGuess); 
			
			}
	}

}
