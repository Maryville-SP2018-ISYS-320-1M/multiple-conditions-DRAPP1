/*
	ISYS 320 DONE DONE DONE!!!
	Name(s): Dave Rapp
	Date: 4-3-18
*/
import java.util.Scanner;
public class P4_ColorNamer {
	
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("What color do you want? ");
		String choice = console.nextLine();
		if (choice.equalsIgnoreCase("r")) {
		    System.out.println("You have chosen Red.");
		} else if (choice.equalsIgnoreCase("g")) {
		    System.out.println("You have chosen Green.");
		} else if (choice.equalsIgnoreCase("b")) {
		    System.out.println("You have chosen Blue.");
		} else {
		    System.out.println("Unknown color: " + choice);
		}
	}
}
