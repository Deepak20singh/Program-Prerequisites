import java.util.*;
import java.lang.*;

class Volume {



    public static void main(String args[]) {
		int radius,height;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the radius of cylinder :- ");
		radius=sc.nextInt();
		System.out.println();
		System.out.print("Enter the height of cylinder :- ");
		height=sc.nextInt();
		System.out.println();
		double volume;
		volume = Math.PI * radius*radius * height;
		System.out.println("The volume of cylinder is "+volume);
               
    }
}

