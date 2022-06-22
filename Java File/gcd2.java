import java.util.Scanner;

public class gcd2{
	public static void main(String [] args){

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the first number   : ");
		int m = scan.nextInt();

		System.out.print("Enter the second number  : ");
		int n = scan.nextInt();

		while(m!=n){

			if(m>n){
				m-=n;
			}

			else{
				n-=m;
			}
	}
	System.out.println("GCD of given numbers is  : "+m);
  }
}