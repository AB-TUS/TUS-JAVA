package week_two;
import java.util.*;

public class Operators {

static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter the value of x : ");
		int x = sc.nextInt();
		System.out.print("Enter the value of y : ");
		int y = sc.nextInt();
		logicalOps(x,y);
		simpleMath(x,y);
		System.out.println("Is "+x+" a multiple of "+ y +" : "+modulus(x,y));
		incrDecr();
	}
	
	public static void logicalOps(int x, int y) {
		if(x>0 && y>0) {
			System.out.print("Both numbers are positive");
		}
		else if(x<0 && y<0){
			System.out.print("Both numbers are negative");
		}
		else if(x==0 || y==0){
			System.out.print("At least one number is zero");
		}
		else if(x<0 || y<0) {
			System.out.print("At least one number is negative");
		}
	}
	
	public static void simpleMath(int x, int y){
		System.out.println("The sum of "+ x +" and "+ y +" is "+ (x+y));
		System.out.println("The difference of "+ x +" and "+ y +" is "+ (x-y));
		System.out.println("The product of "+ x +" and "+ y +" is "+ (x*y));
		System.out.println("The quotient of "+ x +" and "+ y +" is "+ (x/y));
	}
	
	public static boolean modulus(int x, int y) {
		if(x%y==0) 
			return true;
		else
			return false;
	}
	
	public static void incrDecr() {
		int x=0, w=0, y=0, z=0;
		x=4;
		System.out.println(++x);
		System.out.println(x++);
		System.out.println(x);
		System.out.println(--x);
		System.out.println(x--);
		System.out.println(x);

		w=20;
		x=10;
		y=-5;
		z=0;
		System.out.println( w == x && y != z  );
		System.out.println( w == x || y != z  );
		System.out.println( ! ( w == (x + z) )  );

	}

}
