package com.game;


//*************************************************************************************************************************************
//----------------------- 	ICI 	ON 	A 	LES 	MECANISMES 	COMMUNS 	AUX 	DEUX 	JEUX	-----------------------------------
//*************************************************************************************************************************************

import java.util.Random;

import com.menu.Menu;
import com.modes.AttackMode;
import com.modes.DefenseMode;
import com.modes.DualMode;
import com.players.Computer;
import com.players.Player;

public abstract class AbstractGame {

	protected static AbstractGame game;
	public static int guessCombi[];
	public static int secretCombi[];
	public static int allowedTry; //declared as  "public"  because of the challengerMode
	public static int matchingCode; 
	public static int almostMatching; 
	public static int unmatching;
	protected int casesNumber;
	public static int [] random = Computer.codeGenerator();// Computer.codeGenerator();  --->   generate a solution !!!
	public static int[] randomCompute;

	//-------------------------------------------------------------- Contructeur par D�faut
	protected AbstractGame() {

		int guessCombi[];
		int secretCombi[];
		allowedTry=(9);
		matchingCode=(0);
		almostMatching=(0);
		unmatching=(0);
		casesNumber=(0);
	}

	//-------------------------------------------------------------- Constructeurs � param�tres
	protected AbstractGame(int[] pGuessCombi, int[] pSecretCombi, int pTry, int pMatch, int pAlmost, int pUnmatch, int pCases) {

		guessCombi = pGuessCombi;
		secretCombi = pSecretCombi;
		allowedTry = pTry;
		matchingCode = pMatch;
		almostMatching = pAlmost;
		unmatching = pUnmatch;
		casesNumber = pCases;
	}

	//-------------------------------------------------------------- Getters et Setters

	public int[] getGuessCombi() {
		return guessCombi;
	}

	public int[] getSecretCombi() {
		return secretCombi;
	}

	public int getAllowedTry() {
		return allowedTry;
	}

	public int getMatchingCode() {
		return matchingCode;
	}

	public int getAlmostMatching() {
		return almostMatching;
	}

	public int getUnmatching() {
		return unmatching;
	}

	public int getCasesNumber() {
		return casesNumber;
	}

	//------------------------------------------------------------------

	public void setGuessCombi(int[] pGuessCombi) {
		guessCombi = pGuessCombi;
	}

	public void setSecretCombi(int[] pSecretCombi) {
		secretCombi = pSecretCombi;
	}

	public void setAllowedTry(int pTry) {
		allowedTry = pTry;
	}

	public void setMatchingCode (int pMatch) {
		matchingCode = pMatch;
	}

	public void setAlmostMatching (int pAlmost) {
		almostMatching = pAlmost;
	}

	public void setUnmatching (int pUnmatch) {
		unmatching = pUnmatch;
	}

	public void setCasesNumber (int pCases) {
		casesNumber = pCases;
	}

	//---------------------------------------------------------------Getters for Game Modes

	//--------------------------------------------------------------------------------- METHODS

	public static void gameLauncher() {

		AbstractGame game;

		if (Menu.selectTheGame != 0 && Menu.selectTheMode != 0) {

			//----------------------------------------------------------------------------------below the code call the game without any mode

			if (Menu.selectTheGame == 1) {
				game = new MoreOrLess();
			}
			else {
				game = new MasterMind();
			}

			//-----------------------------------------------------------------------------------below, the code is not functional yet...

			if (Menu.selectTheMode == 1) {/////////////////////le mode de jeu est a passer en constructeur de + / - et MM !    OU PAS ???????????? !!!!!!!!!!!!!
				AttackMode.attackMode();
			}
			else if (Menu.selectTheMode == 2) {
				DefenseMode.defenseMode();
			}
			else if (Menu.selectTheMode == 3) {
				DualMode.dualMode();
			}
		}
	}
}


