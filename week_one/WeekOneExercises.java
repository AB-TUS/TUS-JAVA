package week_one;

import java.util.Scanner;

public class WeekOneExercises{
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args){

  		// a. Call/invoke the method addNumbers passing down 3 and 2. 
		int sum=addNumbers(3,2);
		System.out.println("The sum is : "+sum);

		// b. Call/invoke the method didOswaldActAlone
		boolean actAlone=didOswaldActAlone();
		System.out.println(actAlone);
		
		// c. Call/invoke the method wasOjGuilty. 
		boolean guilty = wasOJGuilty();
		System.out.println(guilty);
		
		// d. Call/invoke the method filmOrBook. 
		String filmOrBook=filmOrBook();
		System.out.println(filmOrBook);
		
		// e. Call/invoke the method filmRating passing down a hardcoded String which represents your favourite film. 
		System.out.println(filmRating("Top Gun"));
		
		// The exercise for the video upload...
		
		System.out.println("Enter the value for x ");
		int x = sc.nextInt();
		System.out.println("Enter the value for y ");
		int y = sc.nextInt();
		System.out.println("Enter the value for z ");
		int z = sc.nextInt();
		
		int result= doFormula(x, y, z);
		System.out.println("The result of the formula is : "+result);
		
	}

	

	public static int addNumbers(int a, int b){
		int sum = a+b;
		return sum;
	}

	public static boolean didOswaldActAlone(){
		System.out.println("Did Oswald Act alone?\n");
		boolean actAlone=sc.nextBoolean();
		return actAlone;
	}
	
	public static boolean wasOJGuilty() {
		System.out.println("Was OJ Guilty?\n");
		boolean guilty=sc.nextBoolean();
		return guilty;
	}
	
	public static String filmOrBook() {
		System.out.print("Do you prefer a film or a book? ");
		String filmOrBook= sc.next();
		return filmOrBook;
	}
	
	public static int filmRating(String favFilm) {
		System.out.println("Enter the rating for? "+favFilm+" : ");
		int rating = sc.nextInt();
		return rating;
	}
	
	public static int doFormula(int x, int y, int z) {
		int result = 2*x*y+z;
		return result;
	}

}