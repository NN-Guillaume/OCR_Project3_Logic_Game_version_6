package com.menu;

public enum GameModeSelect {

	OFFENSIVE("Offensive mode: you shall beat the computer !"),
	DEFENSIVE ("Defensive mode: the computer will try to beat your secret combination !"),
	DUALIST ("Dualist mode: the computer and you play until there is one winner !");

	public  String nameMode;


	//-------------------------------------------------Constructeur 
	GameModeSelect (String nameMode) {
		this.nameMode = nameMode;
	}

	public void getNameMode() {
		System.out.println("\nThe selected mode is the "+nameMode);
	}
	/*
	public String toString() {
		return nameMode;
	}
	 */
}
