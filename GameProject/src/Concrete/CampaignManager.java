package Concrete;

import Abstract.CampaingManager;
import Entities.Campaign;

public class CampaignManager implements CampaingManager {

	public void addCampaign(Campaign campaign) {
		System.out.println("Kampanya eklendi: "+campaign.getCampignName());
	}
	
	public void deleteCampaign(Campaign campaign) {
		System.out.println("Kampanya silindi: "+campaign.getCampignName());
	}

	public void updateCampaign(Campaign campaign) {
		System.out.println("Kampanya güncellendi :"+campaign.getCampignName());
	}
}
