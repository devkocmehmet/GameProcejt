package Concrete;

import Abstract.GameManagerService;
import Entities.*;

public class GameManager implements GameManagerService{
	public void addGame(Game game) {
		System.out.println(game.getGameName()+" oyunu eklendi.");
	}
	
	public void deleteGame(Game game) {
		System.out.println(game.getGameName()+" oyunu silindi.");
	}

	public void updateGame(Game game) {
		System.out.println(game.getGameName()+" oyunu güncellendi.");
	}
}
