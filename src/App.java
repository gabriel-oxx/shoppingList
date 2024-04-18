
import java.util.Collections;
import java.util.Scanner;

public class App {
	public static void main(String[] args) throws Exception {

		Scanner input = new Scanner(System.in);
		String menu = """
				Escolha uma opção:
				1 - Comprar
				2 - Verificar itens adquiridos
				3 - Sair
				""";
		int option = 0;
		CreditCard creditCard = new CreditCard(800);

		while (option != 3) {
			System.out.println(menu);
			option = input.nextInt();
			if (option == 1) {
				System.out.println("Insira o valor do ítem");
				double itemValue = input.nextDouble();

				if (creditCard.getBalance() > itemValue) {
					System.out.println("Insira a descrição");
					String itemDescription = input.next();
					Shopping shopping = new Shopping(itemValue, itemDescription);
					creditCard.chargePurchase(shopping);
					System.out.println("Item adquirido");
				} else
					System.out.println("Saldo insuficiente. Você possui R$ " + creditCard.getBalance());
			}
			Collections.sort(creditCard.getShoppingList());
			if (option == 2) {

				for (Shopping s : creditCard.getShoppingList()) {
					System.out.println(s.getDescription() + " - " + s.getValue());
				}
			}
		}
input.close();
	}

}
