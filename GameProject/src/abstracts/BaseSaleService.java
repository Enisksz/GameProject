package abstracts;

import entities.Customer;
import entities.Game;
import entities.Sale;

public abstract class BaseSaleService {
	public abstract void sell(Customer customer,Game[] game,Sale sale);
}
