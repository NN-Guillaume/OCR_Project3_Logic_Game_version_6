package com.modes;

import java.util.Arrays;
import java.util.Scanner;

import com.game.AbstractGame;
import com.players.Computer;
//import com.jeu.StrSaisieException;
//import com.jeu.StrTailleException;
import com.players.Player;

public class DefenseMode extends GamesModes {

	//---------------------------------------------------------------variables

	public static int[] secretCode = new int [4];
	public static int count;
	public static int[] computeGuess;

	//---------------------------------------------------------------Constructeur (default)

	//---------------------------------------------------------------Constructeur (parameters)

	//---------------------------------------------------------------Getters & Setters

	//---------------------------------------------------------------Methods

	//doesn't work ...
	public static int[] secretCode() {	

		int secretNber [] = {10,10,10,10};
		int i =0;
		for (i=0;	i<secretNber.length;	i++) {
			Scanner sn = null;
			int slot = sn.nextInt(9);

			while (slot==secretNber[0] || slot==secretNber[1] || slot==secretNber[2] || slot==secretNber[3]) {
				slot = sn.nextInt(9)+1;
			}
			secretNber[i] = slot;
		}
		return secretNber;
	}


	public static int[] defenseMode() {

		//here ask the player (as a defender) to enter a code !
		System.out.println("Please, enter your secret combination below.\n");
		Scanner sc = new Scanner (System.in);
		secretCode[count] = sc.nextInt();
		System.out.println("Now, it's up to the computer !");

		AbstractGame.matchingCode = 0;	
		AbstractGame.unmatching = 0;

		while(AbstractGame.allowedTry > 0 && AbstractGame.matchingCode != 4){

			int[] guess = {0,0,0,0};	//int[] guess = Computer.refineGuess();  

			if (AbstractGame.allowedTry == 9) {
				guess = Computer.firstGuess();
			}
			else if (AbstractGame.allowedTry < 9) {	
				guess = Computer.refineGuess();	
			}

			for(int i=0;i<guess.length;i++){ 											

				if(guess[i] == DefenseMode.secretCode[i]){
					AbstractGame.matchingCode ++;
				}

				else if(guess[i]== DefenseMode.secretCode[0] || guess[i]== DefenseMode.secretCode[1] || guess[i]== DefenseMode.secretCode[2] || guess[i]== DefenseMode.secretCode[3]){
					AbstractGame.unmatching++;	
					System.out.println("Trololo !");
				}
			}

			//----------------------------------------------------------------------------------------------------- In case of success

			if(AbstractGame.matchingCode == 4) {
				System.out.print("Damn !The computer have found your secret combination !");
				for(int i=0;i<guess.length;i++){
					System.out.print(guess[i]);
				}
			}

			//------------------------------------------------------------------------------------------------------ DO NOT WORK AS IT SHOULD !!!S

			else {

				for(int i = 0; i <DefenseMode.secretCode.length ; i++) {

					if(guess[i] == DefenseMode.secretCode[i]) {
						System.out.println("=");
					}
					else if(guess[i] < DefenseMode.secretCode[i]) {
						System.out.println("+");
					}
					else if(guess[i] > DefenseMode.secretCode[i]) {
						System.out.println("-");
					}

					//------------------------------------------------------------------------------------------------------last attempt

					else{
						AbstractGame.allowedTry--;
						if(AbstractGame.allowedTry > 1){
							System.out.println("\n" + AbstractGame.allowedTry + " attempt remaining.");
						}

						else if(AbstractGame.allowedTry == 1){																				
							System.out.println("\nLast attempt!");
						}

						//--------------------------------------------------------------------------------------------------- In case of fail
						else{
							System.out.println("Congrats, the computer didn't find your secret combination.");
							System.out.print("The number is: ");
							for(int i1=0;i1<DefenseMode.secretCode.length;i++){
								System.out.print(DefenseMode.secretCode[i]);
							}
						}
					}
				}
			}
			System.out.println(AbstractGame.allowedTry);
			AbstractGame.allowedTry--;
			System.out.println(AbstractGame.matchingCode);
			AbstractGame.matchingCode--;
		}

		return null; 
	}

	/*
	@Override
	public int[] genCombiOrdinateur() {
		// TODO Auto-generated method stub
		return null;
	 */

	//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	/*
	@Override
	public int[] genCombiOrdinateur() {	// USELESS !
		// TODO Auto-generated method stub
		return null;
	}
	 */
}

