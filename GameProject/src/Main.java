import adapters.MernisServisAdapter;
import concrete.CampaignManager;
import concrete.CustomerManager;
import concrete.GameManager;
import concrete.SaleManager;
import entities.Campaign;
import entities.Customer;
import entities.Game;


public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager(new MernisServisAdapter());
		GameManager gameManager = new GameManager();
		CampaignManager campaignManager = new CampaignManager();
		
		
		Customer customer1 = new Customer(1,"Enis","Öksüz","11111111111",2000);
		customerManager.add(customer1);
		
		Campaign campaign1 = new Campaign(2," Valentine's Day ");
		campaignManager.add(campaign1);
		
		Game game = new Game(3,"CS GO",24);
		gameManager.add(game);
		
		SaleManager saleManager = new SaleManager();
		saleManager.sell(customer1, game, campaign1);
	}

}
