package com.players;

//import com.jeu.StrSaisieException;
//import com.jeu.StrTailleException;
import java.util.Scanner;

public class Human extends Player {

	//---------------------------------------------------------------variables

	//---------------------------------------------------------------Constructor (default)

	//---------------------------------------------------------------Constructor (parameters)

	//---------------------------------------------------------------Getters & Setters

	//---------------------------------------------------------------Methods

	/**
	 * Cette méthode permet au joueur humain de saisir sa combinaison 
	 * @return strCombiHumain
	 * @throws StrSaisieException 
	 * @throws StrTailleException 
	 */
	/*	
	public int[] humanEntry() throws StrSaisieException, StrTailleException { // The method who check the human entry already exist in the PLAYER class ! ! ! USELESS ! ! !

		Scanner sc = new Scanner(System.in);
		String strCombiHuman = "";
		int tabCombiHuman[] = new int[nbCase];

		try {

			strCombiHuman = sc.nextLine();

			Integer.parseInt(strCombiHuman);

		}catch (NumberFormatException e) {

			throw new StrSaisieException(strCombiHuman + " Ce n'est pas un nombre !");
		}

		if(strCombiHuman.length() != nbCase) {

			throw new StrTailleException(" Le nombre de case est différent de celui attendu ! ");
		}

		//Conversion de la strCombiHumain en un tableau
		for(int i = 0; i < strCombiHuman.length(); i++) {

			tabCombiHuman[i] = Character.getNumericValue(strCombiHuman.charAt(i));

		}
		return tabCombiHuman;
	}
	 */
}
