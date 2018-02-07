package agency.werewolf.jintable;

import java.util.ArrayList;
import java.util.List;

import agency.werewolf.jintable.game.Game;

public class JinGameManager {

	private final List<Game> gameList;

	public JinGameManager() {
		gameList = new ArrayList<Game>();
	}

	public List<Game> getGameList() {
		return gameList;
	}



}
