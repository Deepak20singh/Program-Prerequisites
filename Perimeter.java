import java.util.*;


class Perimeter {



    public static void main(String args[]) {
		int length,breadth,perimeter;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the length Number :- ");
		length=sc.nextInt();
		System.out.println();
		System.out.print("Enter the breadth Number:- ");
		breadth=sc.nextInt();
		System.out.println();
		
		perimeter = 2*(length+breadth);
		System.out.println("The perimeter of rectangle is "+perimeter);
               
    }
}

