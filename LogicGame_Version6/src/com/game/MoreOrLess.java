package com.game;

import java.util.Random;
import java.util.Scanner;

import com.players.Computer;
import com.players.Player;

//*************************************************************************************************************************************
//----------------------- 	ICI 	ON 	A 	LES 	MECANISMES 		PROPRES 	A 	"RECHERCHE +/-"	-----------------------------------
//*************************************************************************************************************************************

public class MoreOrLess extends AbstractGame{

	//--------------------------------Default Constructor-----------------------------------------------------------------------------------------------------------------------------------

	public MoreOrLess()	{
		super();

	}

	//-------------------------------Initialization Constructor-----------------------------------------------------------------------------------------------------------------------------

	protected MoreOrLess(int[] pGuessCombi, int[] pSecretCombi, int pTry, int pMatch, int pAlmost, int pUnmatch, int pCases)	{
		super();

	}

	//-------------------------------Getters & Setters ---------------------------------------------------------------------------------------------------------------------------

	//-------------------------------Mehods---------------------------------------------------------------------------------------------------------------------------------------

	/*
	@Override
	public String compareResults(int matchingCode, int unmatching) {

		String strCompareResult = "";

		for(int i = 0; i < secretCombi.length ; i++) {

			if(guessCombi[i] == secretCombi[i]) {
				strCompareResult = "=";
			}
			else if(guessCombi[i] < secretCombi[i]) {
				strCompareResult ="+";

			}
			else if(guessCombi[i] > secretCombi[i]) {
				strCompareResult = "-";
			}
		} 	
		return strCompareResult;
	}
	 */
}

