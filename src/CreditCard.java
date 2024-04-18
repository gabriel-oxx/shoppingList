import java.util.List;
import java.util.ArrayList;

public class CreditCard {
	private double limit;
	private double balance;
	private List<Shopping> shoppingList;

	public CreditCard(double limit) {

		this.limit = limit;
		this.balance = limit;
		this.shoppingList = new ArrayList<>();
	}

	public double getLimit() {

		return limit;
	}

	public double getBalance() {

		return balance;
	}

	public List<Shopping> getShoppingList() {

		return shoppingList;
	}

	public void chargePurchase(Shopping shopping) {
		this.balance -= shopping.getValue();
		this.shoppingList.add(shopping);
	}

}
