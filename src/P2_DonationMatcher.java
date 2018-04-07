// DONE DONE DONE !!!!!

import java.util.Scanner;

public class P2_DonationMatcher {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("Is your money multiplied 1 or 2 times? ");
		int times = console.nextInt();
		System.out.print("And how much are you contributing? ");
		int donation = console.nextInt();
		int sum = times * donation;
		int total = donation;

		if (times == 1) {
		    int count1 = 0;
			count1++;
		} else if (times == 2) {
		    int count2 = 0;
			count2++;
		}

		System.out.println("Total donated sum: " + sum);
		System.out.println("Total number of donations: " + total);
	}

}
