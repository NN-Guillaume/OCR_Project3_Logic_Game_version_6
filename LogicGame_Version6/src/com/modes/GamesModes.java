package com.modes;

import java.util.Scanner;

import com.game.AbstractGame;
import com.menu.Menu;
import com.players.Computer;
public abstract class GamesModes {

	//---------------------------------------------------------------variables
	static Scanner sc = new Scanner(System.in);

	public static int devSelec;

	protected static int combiSecreteOrdi[] ;
	protected int propositionOrdi[] ;

	protected int combiSecreteHumain[] ;
	protected int propositionHumain[] ;

	//---------------------------------------------------------------Constructor (default)

	//---------------------------------------------------------------Constructor (parameters)

	//---------------------------------------------------------------Getters & Setters

	//---------------------------------------------------------------Methods

	public static void devMode() {

		System.out.println(" Do you want to launch the game in developper mode ? ");
		System.out.println(" press \"1\" to enable the developper mode. ");
		System.out.println(" press \"2\" to disable the developper mode. ");
		devSelec = sc.nextInt();

		switch(devSelec)
		{
		case 1:
			System.out.println("developper mode is now enabled");
			System.out.println("The solution number is: "+"\n");
			if (Menu.selectTheMode == 1) {
				for(int i=0;i<AbstractGame.random.length;i++){
					System.out.println(AbstractGame.random[i]);
				}
			}
			else if (Menu.selectTheMode == 2) {
				System.out.println("It's up to you to generate the solution !");
			}
			else if (Menu.selectTheMode == 3) {
				System.out.println("Ask to Computron !");
			}
			break;

		case 2:
			System.out.println("developper mode is now disabled");
			break;

		default:
			System.out.println("Error - invalid command !");
		}
	}
}
