package week_two;
import java.util.*;

public class Circle {

static Scanner sc=new Scanner(System.in);


	public static void main(String[] args) {
		System.out.println("Enter the radius : ");
		double radius = sc.nextDouble();
		double diameter = calcDiameter(radius);
		double circumference =calcCircumference(radius);
		double area =calcArea(radius);
		
		System.out.println("The diameter of the circle is : "+diameter);
		System.out.println("The circumference of the circle is : "+circumference);
		System.out.println("The area of the circle is : "+area);

	}
	public static double calcDiameter(double r) {
		return 2*r;
	}
	
	public static double calcCircumference(double r) {
		return 2*Math.PI*r;
	}
	
	public static double calcArea(double r) {
		return Math.PI*Math.pow(r, 2);
	}

}
