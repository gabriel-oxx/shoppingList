
public class Shopping implements Comparable<Shopping>{
	private double value;
	private String description;

	public Shopping(double value, String description) {

		this.value = value;
		this.description = description;
	}

	public double getValue() {

		return value;
	}

	public String getDescription() {

		return description;
	}

	@Override
	public String toString() {

		return "Compra: descrição = " + description +
				       "valor = " + value;

	}


	@Override
	public int compareTo(Shopping otherShopping) {

		return  Double.valueOf(this.value).compareTo(Double.valueOf(otherShopping.value));
	}
}
