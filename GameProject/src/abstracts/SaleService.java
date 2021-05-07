package abstracts;

import entities.Campaign;
import entities.Customer;
import entities.Game;


public interface SaleService {
	void sell (Customer customer,Game game,Campaign campaign);
}
