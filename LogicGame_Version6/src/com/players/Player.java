package com.players;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//import com.modes.StrSaisieException;
//import com.modes.StrTailleException;

public abstract class Player {


	//---------------------------------------------------------------variables
	protected static int [] random = Computer.codeGenerator();
	protected static int [] randomCompute = Computer.codeGenerator();
	//---------------------------------------------------------------Constructeur (default)

	//---------------------------------------------------------------Constructeur (parameters)

	//---------------------------------------------------------------Getters & Setters

	//---------------------------------------------------------------Methods

	public static int[] getGuess() {

		Scanner keyboard = new Scanner(System.in);
		System.out.println("\nYou are now playing to the + / - Game !");
		System.out.println("\nPlease enter your guess: ");
		String input = keyboard.nextLine();

		if(input.length()!=4 || input.replaceAll("\\D","").length()!=4){
			System.out.println("Invalid number. You must enter 4 digits between 0-9 only.");
			return getGuess();
		}

		int[] guess = new int[4];
		for (int i = 0; i < 4; i++) {
			guess[i] = Integer.parseInt(String.valueOf(input.charAt(i)));
		}

		return guess;
	}

	//--------------------------------------------------------------------------------------------------- the code below is NOT USED at the moment !
	/*
	class StrSaisieException extends NumberFormatException {

		private static final long serialVersionUID = 1L;

		public StrSaisieException(String msg) {
			super(msg);
		}

		public StrSaisieException() {
			super(" Il faut un nombre entier !!");
		}
	}

	class StrTailleException extends Exception {

		private static final long serialVersionUID = 1L;

		public StrTailleException(String msg) {
			super(msg);
		}

		public StrTailleException() {
			super(" Le nombre de case est différent de celui attendu ! ");
		}
	}
	 */
}
