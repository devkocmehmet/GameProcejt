package Concrete;

import Abstract.GamerCheckService;
import Entities.Gamer;

public class CheckRealGamer implements GamerCheckService{
	public boolean IfRealGamer(Gamer gamer) {
		System.out.println("Kullan�c� bilgileri kontrol ediliyor.");
		return true;
	}
}
