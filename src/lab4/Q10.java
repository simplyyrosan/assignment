package lab4;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		
		int num = sc.nextInt();
		int temp = num;
		int sum = 0;
		int p = 1;
		
		while (temp>0) {
			int d = temp%10; 		//The last digit of the number 
			if (d!=0) {				//Checking if digit is 0 or not
				sum = sum + d*p;	//Adding the digit to sum or final output
				p = p*10;			//This will shift the digit 
			}
			temp = temp/10;			//This change the value temp to go through each digit
		}
		
		
		System.out.println("After removing 0 from number "+ num +"the new number is "+ sum+"." );

		sc.close();
		
	}

}
//

