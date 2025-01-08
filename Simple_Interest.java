import java.util.*;
import java.lang.*;

class Simple_Interest {



    public static void main(String args[]) {
		int Principal,Rate,Time;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Principal :- ");
		Principal=sc.nextInt();
		System.out.println();
		System.out.print("Enter the Rate of Interest :- ");
		Rate=sc.nextInt();
		System.out.println();
		System.out.print("Enter the Time of Investment :- ");
		Time=sc.nextInt();
		System.out.println();
		double Simple_Interest;
		Simple_Interest = (Principal * Rate * Time) / 100;
		System.out.println("The Simple_Interest is "+Simple_Interest);
               
    }
}

