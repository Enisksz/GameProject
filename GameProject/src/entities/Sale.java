package entities;

import abstracts.Entity;

public class Sale  implements Entity{
	private int id;
	private String gameId;
	private String customerId;
	
	public Sale() {
		
	}

	public Sale(int id, String gameId, String customerId) {
		super();
		this.id = id;
		this.gameId = gameId;
		this.customerId = customerId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGameId() {
		return gameId;
	}

	public void setGameId(String gameId) {
		this.gameId = gameId;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
}
