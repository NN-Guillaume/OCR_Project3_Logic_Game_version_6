package com.modes;

import java.util.Arrays;
import java.util.Scanner;
import com.game.*;
import com.players.*;


public class AttackMode extends GamesModes {

	//---------------------------------------------------------------variables
	//public int 

	//---------------------------------------------------------------Constructor (default)

	//---------------------------------------------------------------Constructor (parameters)

	//---------------------------------------------------------------Getters & Setters

	//---------------------------------------------------------------Methods

	public static String attackMode() {

		while(AbstractGame.allowedTry >0 && AbstractGame.matchingCode!=4){ 

			int[] guess = Player.getGuess();

			AbstractGame.matchingCode=0;
			AbstractGame.unmatching = 0; 

			for(int i=0;i<guess.length;i++){
				if(guess[i] == AbstractGame.random[i]){
					AbstractGame.matchingCode ++;

				}

				else if(guess[i]== AbstractGame.random[0] || guess[i]== AbstractGame.random[1] || guess[i]== AbstractGame.random[2] || guess[i]== AbstractGame.random[3]){
					AbstractGame.unmatching++;	
				}
			}
			//-----------------------------------------------------------------------------------------------------			 
			//----------------------------------------------------------------------------------------------------- In case of success

			if(AbstractGame.matchingCode == 4) {
				System.out.print("Well done! Your guess is Correct! The number is: ");
				for(int i=0;i<guess.length;i++){
					System.out.print(guess[i]);
				}
			}

			//------------------------------------------------------------------------------------------------------ 
			else {

				for(int i = 0; i <AbstractGame.random.length ; i++) {

					if(guess[i] == AbstractGame.random[i]) {
						System.out.println("=");
					}
					else if(guess[i] < AbstractGame.random[i]) {
						System.out.println("+");
					}
					else if(guess[i] > AbstractGame.random[i]) {
						System.out.println("-");
					}

					//------------------------------------------------------------------------------------------------------last attempt

					else{
						AbstractGame.allowedTry--;
						if(AbstractGame.allowedTry > 1){
							System.out.println("\n" + AbstractGame.allowedTry + " attempt remaining.");
						}

						else if(AbstractGame.allowedTry == 1){																				
							System.out.println("\nLast attempt!. Good luck");
						}

						//--------------------------------------------------------------------------------------------------- In case of fail
						else{
							System.out.println("Sorry, you failed to guess the number in 9 attempts.");
							System.out.print("The number is: ");
							for(int i1=0;i1<AbstractGame.random.length;i1++){
								System.out.print(AbstractGame.random[i1]);
							}
						}
					}
				}
			} 
		}
		return null;
	}

	/*	
	@Override
	public int[] genCombiOrdinateur() {
		// TODO Auto-generated method stub NOT SURE TO USE IT !!!
		return null;
	}
	 */

}
