package hamim;

import java.util.Scanner;

public class Afghan1 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int oil_code = 0;
		int quantity = 0;
		int price = 0;

		for (;;) {

			System.out.println("Please enter oil code: ");
			System.out.println("for Petrol : 111(price 30AFG): ");
			System.out.println("for desil : 222(price 35AFG): ");
			System.out.println("for LPG : 333(price 20AFG): ");

			oil_code = s.nextInt();

			if (oil_code == 111 || oil_code == 222 || oil_code == 333) {

				System.out.print("now enter quantity of oil: ");
				quantity = s.nextInt();

				if (oil_code == 111) {
					price = quantity * 30;
				} else if (oil_code == 222) {
					price = quantity * 35;
				} else if (oil_code == 333) {
					price = quantity * 20;
				}

				int discount = 0;

				if (quantity >= 10) {
					discount = price * 2 / 100;
				}
				System.out.println("Total Price: " + price);
				System.out.println("discount: " + discount);
				System.out.println("Net Price: " + (price - discount) + "\n");
			} else {
				System.out.println("Invalid code number...");
			}

		}

	}
}