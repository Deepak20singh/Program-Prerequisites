import java.util.*;


class Average {



    public static void main(String args[]) {
		int first,second,third;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the First Number :- ");
		first=sc.nextInt();
		System.out.println();
		System.out.print("Enter the Second Number:- ");
		second=sc.nextInt();
		System.out.println();
		System.out.print("Enter the Third Number:- ");
		third=sc.nextInt();
		System.out.println();
		double Average;
		Average = (first+second+third) / 3;
		System.out.println("The Average of "+first+","+second+" and "+third+" is "+Average);
               
    }
}

