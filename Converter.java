
import java.util.*;

class Converter {



    public static void main(String args[]) {
		int Celsius;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the temperature in Celsius :- ");
		Celsius=sc.nextInt();
		System.out.println();
		int Fahrenheit;
		Fahrenheit = (Celsius * 9/5) + 32;
		System.out.println("The temperature in fahrenheit is "+Fahrenheit);
               
    }
}

