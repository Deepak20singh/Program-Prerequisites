import java.util.*;
import java.lang.*;

class Area {



    public static void main(String args[]) {
		int radius;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the radius of circle :- ");
		radius=sc.nextInt();
		System.out.println();
		double Area;
		Area = Math.PI * radius*radius;
		System.out.println("The area of circle is "+Area);
               
    }
}

