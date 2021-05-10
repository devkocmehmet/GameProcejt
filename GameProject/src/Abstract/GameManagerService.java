package Abstract;
import Entities.*;

public interface GameManagerService {
	void addGame(Game game);
	
	void deleteGame(Game game);
	
	void updateGame(Game game);
}
