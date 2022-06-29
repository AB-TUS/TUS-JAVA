package week_two;
import java.util.*;

public class ConditionalLogic {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		preAndPostDifference();
		booleanLogicShortCircuitOps();
		booleanBitwiseOps();
		compareStrings();
		
		System.out.println("Enter the certification : ");
		int cert = sc.nextInt();
		System.out.println("Enter the age : ");
		int age = sc.nextInt();
		System.out.println(admitToFilm(cert, age));
		
		switchVowelOrConsonant();
		ifMonth();
		ifGrade();
		switchMathOperation();
		ifTemperature();
		
		//11.	switchDaysInMonth()
		switchDaysInMonth();

	}
	
	
	public static void preAndPostDifference(){
		//a.	declare two local variables x and y initialised to 5 and 10 respectively
		int x=5, y=10;
		
		//x and increment operator
		System.out.println("The value of x is "+ x);
		System.out.println("The value of ++x is " + ++x );
		System.out.println("The value of x++ is " + x++ );
		System.out.println("The value of x is "+ x);
		
		// do the exact same for y, except use the prefix/postfix decrement operator i.e. --
		System.out.println("The value of y is "+ y);
		System.out.println("The value of --y is " + --y );
		System.out.println("The value of y-- is " + y-- );
		System.out.println("The value of y is "+ y);

	}
	
	public static void booleanLogicShortCircuitOps(){
		boolean b = false;
		int x = 3;
		if(x<0 && (b=true) ) {}
			System.out.println(b);
		if(x>0 || (b=true) ) {}
			System.out.println(b);

	}
	
	public static void booleanBitwiseOps() {
		boolean b = false;
		int x = 3;
		if(x<0 & (b=true) ) {}
			System.out.println(b);
		if(x>0 | (b=true) ) {}
			System.out.println(b);
	}
	
	public static void compareStrings() {
		System.out.println("Enter 1st String : ");
		String s1=sc.next();
		
		System.out.println("Enter 2nd String : ");
		String s2=sc.next();
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
	}
	
	public static boolean admitToFilm(int cert, int age) {
		return age>cert;
	}

	public static void switchVowelOrConsonant() {
		System.out.println("Enter a character");
		char input = sc.next().charAt(0);
		
		if (((input>='a')&&(input<='z'))||((input>='A')&&(input<='Z'))) {
			switch(input) {
				default:
					System.out.println(input + " is a consonant");
					break;
				case 'a':
				case 65:
				case 'e':
				case 69:
				case 'i':
				case 'I':
				case 'o':
				case 'O':
				case 'u':
				case 'U':
					System.out.println(input + " is a vowel");
					break;
			}
		}else {
			System.out.println(input + " is not a valid input");
		}
	}
	
	public static void ifMonth(){
		final int JAN=1, FEB=2, MAR=3, APR=4, MAY=5, JUN=6, JUL=7, AUG=8, SEP=9, OCT=10, NOV=11, DEC=12;
		System.out.println("Enter the month(1-12) : ");
		int month=sc.nextInt();
		if(month==1)
			System.out.println("January");
		else if(month==2)
			System.out.println("February");
		else if(month==3)
			System.out.println("March");
		else if(month==4)
			System.out.println("April");
		else if(month==5)
			System.out.println("May");
		else if(month==6)
			System.out.println("June");
		else if(month==7)
			System.out.println("July");
		else if(month==8)
			System.out.println("August");
		else if(month==9)
			System.out.println("September");
		else if(month==10)
			System.out.println("October");
		else if(month==11)
			System.out.println("November");
		else if(month==12)
			System.out.println("December");
		else
			System.out.println(month +"is out of range");
	}
	
	
	public static void ifGrade() {
		System.out.println("Enter the mark : ");
		int mark = sc.nextInt();
		if((mark<0)||(mark>100))
			System.out.println("Mark out of range!");
		else {
			if(mark>69)
				System.out.print("A");
			else if(mark>59)
				System.out.print("B");
			else if(mark>49)
				System.out.print("C");
			else if(mark>39)
				System.out.print("D");
			else
				System.out.print("Fail");
		}
		
	}
	
	
	public static void switchMathOperation() {
		double answer = 0.0;
		boolean charOK =true;
		System.out.println("Enter first double number : ");
		double num1 = sc.nextDouble();
		System.out.println("Enter second double number : ");
		double num2 = sc.nextDouble();
		

		System.out.println("Enter a character : ");
		char operation = sc.next().charAt(0);
		
		switch(operation) {
			case '+':
				answer = num1+num2;
				break;
			case '-':
				answer = num1-num2;
				break;
			case '*':
				answer = num1*num2;
				break;
			case '/':
				answer = num1/num2;
				break;
			default:
				System.out.println("Unknown mathematical operator \""+operation+"\"!");
				charOK = false;
		}
		if(charOK==true)
			System.out.println("The answer is : "+answer);
			
	}
	
	
	public static void ifTemperature(){
		int temperature = 0;
		final int COLD=0, MILD=15, WARM=20, VERY_WARM=25, HOT=30;
		System.out.println("Enter the temperature : ");
		temperature = sc.nextInt();
		if(temperature<=COLD)
			System.out.println("cold"); 
		else if(temperature<MILD)
			System.out.println("a little cold but ok"); 
		else if(temperature<WARM) 
			System.out.println("mild"); 
		else if(temperature<VERY_WARM) 
			System.out.println("warm"); 
		else if(temperature<HOT) 
			System.out.println("very warm"); 
		else
			System.out.println("hot");
	}
	
	public static void switchDaysInMonth() {
		System.out.println("Enter the year : ");
		int year = sc.nextInt();
		System.out.println("Enter the month : ");
		int month = sc.nextInt();
		int numDays = 0;
		final int JAN=1, FEB=2, MAR=3, APR=4, MAY=5, JUN=6, JUL=7, AUG=8, SEP=9, OCT=10, NOV=11, DEC=12;
		
		switch(month) {
		case JAN:
		case MAR:
		case MAY:
		case JUL:
		case AUG:
		case OCT:
		case DEC: 
			numDays=31;
			break;
		case APR:
		case JUN:
		case SEP:
		case NOV:
			numDays=30;
			break;
		case FEB:
			if((year%400==0)||((year%4==0)&&(year%100!=0)))
				numDays=29;
			else
				numDays=28;
			break;
		default:
			System.out.println("Invalid Input!!!");
		}
		if(numDays != 0)
			System.out.println("Number of days : "+numDays);
	}
}
