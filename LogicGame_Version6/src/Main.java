import com.game.*;
import com.menu.Menu;
import com.modes.*;

public class Main {

	public static void main(String[] args) {

		System.out.println("Welcome into the Logic Game !");

		Menu.SelectGame();
		Menu.ChooseGameMode();
		GamesModes.devMode();
		AbstractGame.gameLauncher();
		Menu.EndPartyMenu();

	}

}