package Abstract;

import Entities.Campaign;

public interface CampaingManager {
	void addCampaign(Campaign campaign);
	
	void deleteCampaign(Campaign campaign);
	
	void updateCampaign(Campaign campaign);
}
