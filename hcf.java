package myproject;
import java.util.Scanner;

public class Hcf {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter any two numbers : ");
	 int a = sc.nextInt();
	 int b = sc.nextInt();
	 int d = 0;
	 for(int i = 1; i<a; i++) {
		 if(a%i == 0 && b%i == 0) {
			 d = i;
			 
		 }
	 }
	 System.out.println(d);
	}

}
