package com.game;

import java.util.Random;
import java.util.Scanner;

import com.players.Player;

//*************************************************************************************************************************************
//----------------------- 	ICI 	ON 	A 	LES 	MECANISMES 		PROPRES 	AU 		MASTERMIND	-----------------------------------
//*************************************************************************************************************************************

public class MasterMind extends AbstractGame{


	//--------------------------------Default Constructor-----------------------------------------------------------------------------------------------------------------------------------

	public MasterMind()	{
		super();						
	}

	//-------------------------------Initialization Constructor-----------------------------------------------------------------------------------------------------------------------------

	protected MasterMind(int randomNbre, int identityCase, int allowTry, int matchTry, int almostOk)	{
		super();
	}

	//--------------------------------------------------------------------------------------------------------------------------------------
	/*
	protected static int[] codeGenerator() {

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
	 */
	//-----------------------------------------------------------------------------------------------------------------------------------------
	/*
	protected static int[] getGuess() {

		Scanner keyboard = new Scanner(System.in);
		System.out.println("You are now playing to the Mastermind Game !");
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
	 */
	//--------------------------------------------------------------------------------------------------------------------------------------

	//--------------------------------------------------------------------------------------------------------------------------------------

	{		
		while(allowedTry>0 && matchingCode!=4){
			int[] guess=Player.getGuess();
			matchingCode=0;	// the well placed number(s)
			almostMatching=0;	// the number(s) who's misplaced but exist in the secret code

			for(int i=0;i<guess.length;i++){
				if(guess[i]==random[i]){
					matchingCode++;
				}
				else if(guess[i]==random[0] || guess[i]==random[1] || guess[i]==random[2] || guess[i]==random[3]){
					almostMatching++;
				}
			}

			//----------------------------------------------------------------------------------------------------- In case of success
			if(matchingCode==4){
				System.out.print("Well done! Your guess is Correct! The number is: ");
				for(int i=0;i<guess.length;i++){
					System.out.print(guess[i]);
				}
			}

			//------------------------------------------------------------------------------------------------------ Still not found
			else{
				allowedTry--;
				if(allowedTry>1){
					System.out.println("You have guess "+matchingCode+" correct number in correct position,"+
							" and "+almostMatching+" correct number in incorrect position. \n"+allowedTry+" attempt remaining.");
				}

				else if(allowedTry==1){																				//last attempt
					System.out.println("You have guess "+matchingCode+" correct number in correct position,"+
							" and "+almostMatching+" correct number in incorrect position. \nLast attempt!. Good luck");
				}

				//--------------------------------------------------------------------------------------------------- In case of fail
				else{
					System.out.println("Sorry, you failed to guess the number in 9 attempts.");
					System.out.print("The number is: ");
					for(int i=0;i<random.length;i++){
						System.out.print(random[i]);
					}
				}
			}
		}
	}
	/*
	@Override
	public String compareResults(int matchingCode, int almostMatching) {
		// TODO Auto-generated method stub
		return null;
	}
	 */
}
