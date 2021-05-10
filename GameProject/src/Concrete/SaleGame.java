package Concrete;

import Abstract.SaleGameService;
import Entities.*;

public class SaleGame implements SaleGameService{
	
	public void saleGame(Gamer gamer,Game game) {
		System.out.println(gamer.getFirstName() + " " + game.getGameName() +" oyununu " + game.getGamePrice() +
				"TL vererek aldý.");
	}
	
	public void campaignSaleGame(Gamer gamer,Game game, Campaign campaign) {
		System.out.println(gamer.getFirstName()+" oyuncusu " + game.getGamePrice() + " TL " + game.getGameName()+
				" oyununu %" + campaign.getDiscountRate() + " indirim ile "
				+ (game.getGamePrice() - (game.getGamePrice() * campaign.getDiscountRate())/100) +" TL ye aldý.");
	}
}
