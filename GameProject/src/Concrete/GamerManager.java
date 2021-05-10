package Concrete;

import Abstract.BaseGamerManager;
import Entities.Gamer;

public class GamerManager implements BaseGamerManager{
	
	public void addGamer(Gamer gamer){
		CheckRealGamer checkRealGamer = new CheckRealGamer(); 
		if(checkRealGamer.IfRealGamer(gamer)) {
			System.out.println(gamer.getFirstName()+" "+ gamer.getLastName() +" oyuncu sisteme eklendi.");	
		}
		else {
			System.out.println(gamer.getFirstName()+" b�yle bir kullan�c� bulunamad�.");
		}
	}
	
	public void deleteGamer(Gamer gamer) {
		System.out.println(gamer.getFirstName()+" "+ gamer.getLastName() +" oyuncu sistemden silindi.");
	}
	
	public void updateGamer(Gamer gamer) {
		System.out.println(gamer.getFirstName()+" "+ gamer.getLastName() +" oyuncunun bilgileri g�ncellendi.");
	}
}
