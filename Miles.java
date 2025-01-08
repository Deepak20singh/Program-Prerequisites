import java.util.*;


class Miles {



    public static void main(String args[]) {
		double Kilometers,Miles;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Kilometer :- ");
		Kilometers=sc.nextDouble();
		System.out.println();
		
		
		Miles = Kilometers * 0.621371;
		System.out.println("The Miles is "+Miles);
               
    }
}

