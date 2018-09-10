package com.players;

import java.util.Random;

import com.game.AbstractGame;
import com.modes.DefenseMode;

public class Computer extends Player {

	//---------------------------------------------------------------variables
	public static int[] minMax;
	public static String strComparer; // delete it if useless
	public static int[] guess;
	//---------------------------------------------------------------Constructor (default)

	//---------------------------------------------------------------Constructor (parameters)

	//---------------------------------------------------------------Getters & Setters

	//---------------------------------------------------------------Methods
	public static int[] codeGenerator() {

		Random rm = new Random();
		int rmArray [] = {10,10,10,10};
		int i =0;
		for (i=0;	i<rmArray.length;	i++) {
			int slot = rm.nextInt(9);

			while (slot==rmArray[0] || slot==rmArray[1] || slot==rmArray[2] || slot==rmArray[3]) {
				slot = rm.nextInt(9)+1;
			}
			rmArray [i] = slot;
		}
		return rmArray;

	}

	// NON UTILE POUR LE MOMENT...
	/*	
	public static int[] computeGuess() {
		System.out.println("Try to display this !");

		return guess;
	}
	 */

	public static int[] firstGuess() { // Donne la toute première proposition
		int[] guess = {5,5,5,5};
		return guess;
	}

	public static int[] refineGuess() { // Doit comparer le "premier essai" et donner une nouvelle proposition à partir des indices donnés

		int[] guess = {0,0,0,0};

		for(int i = 0; i <DefenseMode.secretCode.length ; i++) {

			if(guess[i] < DefenseMode.secretCode[i]) { 
				System.out.println("+");
				guess[i] = DefenseMode.computeGuess[i] + 1; 	// minMax[i] = DefenseMode.computeGuess[i] + ((10+2)/2)
			}
			else if(guess[i] > DefenseMode.secretCode[i]) {
				System.out.println("-");
				guess[i] = DefenseMode.computeGuess[i] - 1;
			}
			else if(guess[i] == DefenseMode.secretCode[i]) {
				System.out.println("=");
				guess[i] = DefenseMode.computeGuess[i];
			}
		}
		return null;
	}
}
