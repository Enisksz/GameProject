package concrete;

import abstracts.SaleService;
import entities.Campaign;
import entities.Customer;
import entities.Game;


public class SaleManager implements SaleService{

	@Override
	public void sell(Customer customer, Game game, Campaign campaign) {
		System.out.println(game.getGameName() + " oyunu için " + game.getGamePrice() + " ödediniz");

	}

}
