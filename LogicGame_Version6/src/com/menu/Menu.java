package com.menu;
import java.util.Scanner;

import com.game.*;
import com.modes.GamesModes;

public class Menu {

	static Scanner sc = new Scanner(System.in);

	public static AbstractGame game;
	public static int selectTheGame;
	public static int selectTheMode;
	public static int endOptions;
	//public static boolean retry;

	//----------------------------------------------------------------------------------------------------------------------------------------------
	public static void SelectGame() {

		System.out.println("Please select your Game \n");
		System.out.println("press 1 for +/-");
		System.out.println("press 2 for mmind");
		selectTheGame = sc.nextInt();

		//do {

		switch (selectTheGame) 
		{
		case 1:
			GameSelect moreorless = GameSelect.MOREORLESS;
			moreorless.getGame();
			break;

		case 2:
			GameSelect mastermind = GameSelect.MASTERMIND;
			mastermind.getGame();
			break;

		default:
			System.out.println("NOPE ! Wrong instruction !");
		}
		//} while(!(selectTheGame != 1 && selectTheGame != 2));

	}

	//--------------------------------------------------------------------------------------------------------------------------------------------
	public static void ChooseGameMode() {
		//do {

		System.out.println("Please select the Mode \n");
		System.out.println("press 1 for Offensive mode");
		System.out.println("press 2 for Defensive mode");
		System.out.println("press 3 for Dualist mode");
		selectTheMode = sc.nextInt();

		switch (selectTheMode)
		{
		case 1:
			GameModeSelect attaque = GameModeSelect.OFFENSIVE;
			attaque.getNameMode();
			break;
		case 2:
			GameModeSelect defense = GameModeSelect.DEFENSIVE;
			defense.getNameMode();
			break;

		case 3:
			GameModeSelect duel = GameModeSelect.DUALIST;
			duel.getNameMode();
			break;

		default:
			System.out.println("NOPE ! Wrong instruction !");
		}
		//} while(selectTheMode != 1 && selectTheMode != 2 && selectTheMode != 3);

	}

	//--------------------------------------------------------------------------------------------------------------------------------------------

	public static void InitiateNewParty() {

		AbstractGame newGame;

		if (Menu.selectTheGame == 1) {
			newGame = new MoreOrLess();
		}
		else {
			newGame = new MasterMind();
		}
	}

	//--------------------------------------------------------------------------------------------------------------------------------------------
	public static void EndPartyMenu() {

		System.out.println("\n \t");
		System.out.println(" \"1\" for playing to the same game again");
		System.out.println(" \"2\" for going back to the selection menu");
		System.out.println(" \"3\" Exit");
		endOptions = sc.nextInt();
		AbstractGame newGame;

		//do {
		switch (endOptions){

		case 1:
			System.out.println("You want to play again");
			do {
				if (selectTheGame == 1) {
					newGame = new MoreOrLess();
					shortcutMenu();
				}
				else if (selectTheGame == 2) {
					newGame = new MasterMind();
					shortcutMenu();
				}
			} while (endOptions == 1);
			break;


		case 2:
			Menu.SelectGame();
			Menu.ChooseGameMode();
			GamesModes.devMode();
			AbstractGame.gameLauncher();
			Menu.EndPartyMenu();
			break;

		case 3:
			System.out.println("Have a nice day !");
			break;	            	 

		default:
			System.out.println("Invalid option.");
		}
		//} while(endOptions != 1 && endOptions != 2 && endOptions != 3);
	}

	//--------------------------------------------------------------------------------------------------------------------------------------------

	public static void shortcutMenu() {

		Menu.InitiateNewParty();
		GamesModes.devMode();
		AbstractGame.gameLauncher();
		Menu.EndPartyMenu();

	}

}
