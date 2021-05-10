package Game;
import java.time.LocalDate;

import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.GamerManager;
import Concrete.SaleGame;
import Entities.*;

public class Main {

	public static void main(String[] args) {
		
		Gamer oyuncu1 = new Gamer(1,"Mehmet","Koç","1234",LocalDate.of(1998,10,30),"0555666998");
		GamerManager gamerManager = new GamerManager();
		gamerManager.addGamer(oyuncu1);
		gamerManager.deleteGamer(oyuncu1);
		gamerManager.updateGamer(oyuncu1);
		
		Game oyun1 = new Game(1,"Delta Force",2500);
		GameManager gameManager = new GameManager();
		gameManager.addGame(oyun1);
		gameManager.deleteGame(oyun1);
		gameManager.updateGame(oyun1);
		
		Campaign kampanya1 = new Campaign(1,"Tatil Kampanyasý",40);
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.addCampaign(kampanya1);
		campaignManager.deleteCampaign(kampanya1);
		campaignManager.updateCampaign(kampanya1);
		
		SaleGame saleGame = new SaleGame();
		saleGame.saleGame(oyuncu1, oyun1);
		saleGame.campaignSaleGame(oyuncu1, oyun1, kampanya1);
		
	}

}
