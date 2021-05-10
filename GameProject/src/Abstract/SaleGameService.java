package Abstract;

import Entities.*;

public interface SaleGameService {
	void saleGame(Gamer gamer, Game game);
	
	void campaignSaleGame(Gamer gamer, Game game, Campaign campaign);
}
