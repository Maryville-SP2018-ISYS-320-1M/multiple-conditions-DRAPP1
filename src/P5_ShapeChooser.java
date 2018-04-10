
/*
	ISYS 320
	Name(s):DAVE RAPP
	Date: 4-4-18
*/

import java.util.Scanner;

public class P5_ShapeChooser {

	public static void main(String[] args) {

		System.out.println("TRI OR BOX?");
		Scanner console = new Scanner(System.in);
		String name = console.next();

		if (name.equals("tri")) {

			drawTri();
		}
		if (name == "box") {

			drawBox();
		}
	}

	private static void drawBox() {
		for (int row = 1; row <= 5; row++) {
			for (int col = 1; col <= 9; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	private static void drawTri() {
		for (int row = 1; row <= 5; row++) {
			for (int col = 1; col <= 5 - row; col++) {
				System.out.print(" ");

			}

			for (int col = 1; col <= 2 * row - 1; col++) {
				System.out.print("*");
			}

			System.out.println();
		}
	}

}
