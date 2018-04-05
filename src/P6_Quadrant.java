import java.util.Scanner;

/*
	ISYS 320 - DONE DONE DONE!!!!
	Name(s): Dave Rapp
	Date: 4-4-18
*/

public class P6_Quadrant {
	   public static int quadrant(double x,double y){
	       if(x > 0 && y > 0)
	           return 1;
	       else if( x < 0 && y > 0)
	           return 2;
	       else if( x < 0 && y < 0)
	           return 3;
	       else if( x > 0 && y < 0)
	           return 4;
	       else
	           return 0;
	   }
	   public static void main(String args[]){
		   
		   System.out.println("Enter Point A");
	       Scanner in = new Scanner(System.in);
	       int x = (int) in.nextDouble();
	       System.out.println("Enter Point B");
	       int y = (int) in.nextDouble();
	       System.out.println("Quadrant number :" + quadrant(x,y));

	   }
	}