package com.menu;

public enum GameSelect {	

	MOREORLESS ("+ / - Game"),
	MASTERMIND ("Mastermind Game");

	public  String name;

	//-------------------------------------------------Constructeur 
	GameSelect (String name) {
		this.name = name;
	}
	//-------------------------------------------------

	public String getGame() {
		System.out.println("\nThe selected game is the: "+name);
		return "display test name !--->"+name;
	}

	/*
	public String toString() {
		return name;
	}
	 */
}


