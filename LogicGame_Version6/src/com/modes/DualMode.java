package com.modes;

import java.util.Arrays;


public class DualMode extends GamesModes {

	//---------------------------------------------------------------variables

	//---------------------------------------------------------------Constructeur (default)

	//---------------------------------------------------------------Constructeur (parameters)

	//---------------------------------------------------------------Getters & Setters

	//---------------------------------------------------------------Methods
	
	public static void dualMode() {
		
	}
	// !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!         CLASSE A CONSTRUIRE APRES ETUDE DU CODE CI-DESSOUS !     !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	
	/**
	 * Cette méthode est spécifique pour le <<mode duel>>.
	 * Elle permet à l'ordinateur de deviner la combinaison secrète de joueur humain 
	 * et aussi elle permet au joueur humain de deviner la combinaison secrète de l'ordinateur.
	 * Le premier qui trouve la combinaison secrète de l'autre gagne. 
	 * @param combiSecrete , donné par le joueur humain
	 * @param combiSecrete1, donné par lejoueur ordinateur
	 * @param combiEssai, proposition du joueur ordinateur
	 * @param combiEssai1, proposition du joueur humain
	 * @param saisieOk, variable boolean pour tester si le joueur humain a saisie une proposition sans erreur 
	 * @exception StrSaisieException, StrTailleException 
	 **/
/*	
	public void devinerDuel() {

		//String str1 = "";
		String strResuOrdi = "";
		int Essai = 0;
		boolean saisieOk = false;
		boolean comparerRes = false;
		boolean comparerRes2 = false;

		System.out.println("Donner votre combinaison secrète");

		do {
			try {
				combiSecreteHumain = saisieCombiHumain();
				saisieOk = true;
				
				 //log
				 
				logger.info("Combinaison secrète du joueur: " + Arrays.toString(combiSecreteHumain).replaceAll("\\[|\\]|,|\\s", ""));

			} catch (StrSaisieException e) {

				System.out.println(e.getMessage());
				logger.error(e.getMessage());

			}
			catch (StrTailleException e) {

				System.out.println(e.getMessage());
				logger.error(e.getMessage());
			} 

		}while(!saisieOk);

		combiSecreteOrdi = genCombiOrdinateur();
		System.out.println("L'ordinateur a donné sa combinaison secrète");

		//logg
		 
		logger.info("Combinaison secrète de l'ordinateur : " + Arrays.toString(combiSecreteOrdi).replaceAll("\\[|\\]|,|\\s", ""));

		if(modeDv) {

			System.out.println(Arrays.toString(combiSecreteOrdi).replaceAll("\\[|\\]|,|\\s", ""));
		}

		System.out.println("C'est parti !!");

		do {
			System.out.println((Essai+1) + " tour");
			System.out.println("Donner votre proposition !! ");

			logger.info((Essai+1) + " tour");

			do {
				try {
					propositionHumain = saisieCombiHumain();
					saisieOk = true;

					comparerRes = comparer(propositionHumain,combiSecreteOrdi);

					strComparer = resultatComparer(propositionHumain, combiSecreteOrdi);
					System.out.println("Proposition : " + Arrays.toString(propositionHumain).replaceAll("\\[|\\]|,|\\s", "") + " --> Réponse : " + strComparer +"\n");

					
					 // log
					 
					logger.info("Proposition du joueur: " + Arrays.toString(propositionHumain).replaceAll("\\[|\\]|,|\\s", "") + " --> Réponse : " + strComparer +"\n");

					if(!comparerRes) {

						try {
							Thread.sleep(2000);
						} catch (InterruptedException e) {}

						setStrComparer(strResuOrdi);
						propositionOrdi = genCombiOrdinateur();
						comparerRes2 = comparer(propositionOrdi, combiSecreteHumain);


						System.out.println("Proposition de l'ordinateur");	
						strResuOrdi = resultatComparer(propositionOrdi, combiSecreteHumain);
						System.out.println("Proposition : " + Arrays.toString(propositionOrdi).replaceAll("\\[|\\]|,|\\s", "") + " --> Réponse : " + strResuOrdi +"\n");				

						
						 // log
						 
						logger.info("Proposition de l'ordinateur: " + Arrays.toString(propositionOrdi).replaceAll("\\[|\\]|,|\\s", "") + " --> Réponse : " + strResuOrdi +"\n");

						Essai++;
					}	
				} catch (StrSaisieException e) {

					System.out.println(e.getMessage());
					logger.error(e.getMessage());
				}
				catch (StrTailleException e) {

					System.out.println(e.getMessage());
					logger.error(e.getMessage());
				} 

			}while(!saisieOk);

		}while(!(comparerRes || comparerRes2 ||  Essai > nbEssai));

		System.out.println(toStringDuel(comparerRes, comparerRes2));
		logger.info(toStringDuel(comparerRes, comparerRes2));
	}
*/
	/**
	 * Cette méthode permet d'afficher le résultat du jeu en mode Duel.
	 * @return str , une variable de type String
	 */
/*	
	public String toStringDuel(boolean comparerRes, boolean comparerRes2) {

		String str="";

		if(comparerRes && !comparerRes2) {
			str =  "Bravo!! Vous avez deviné la combinaison secrète de l'ordinateur !!\n";
			str += "\nL'ordinateur a échoué !!";
		}

		else if(!comparerRes && comparerRes2) {
			str = "Aiie!! Vous avez echoué, l'ordinateur a trouvé votre combinaison secrète le premier !!\n";
		}

		else if(!comparerRes && !comparerRes2) {
			str = "Aiie!! Vous avez échoué les deux!!\n"; 
			str += "(Combinaison secrète ordinateur : " + Arrays.toString(combiSecreteOrdi).replaceAll("\\[|\\]|,|\\s", "") + ")\n";
			str += "\n(Votre combinaison secrète  : " + Arrays.toString(combiSecreteHumain).replaceAll("\\[|\\]|,|\\s", "") + ")";
		}
		return str;	
	}
*/
}


