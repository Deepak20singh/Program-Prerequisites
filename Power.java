import java.util.*;
import java.lang.*;


class Power{



    public static void main(String args[]) {
		int First,Second,Number;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Base Number :- ");
		First=sc.nextInt();
		System.out.println();
		System.out.print("Enter the Exponent Number :- ");
		Second=sc.nextInt();
		System.out.println();
		
		
		Number = (int)Math.pow(First,Second);
		System.out.println("the answer of "+First+"^"+Second+" is "+Number);
               
    }
}

