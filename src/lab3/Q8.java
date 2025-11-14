package lab3;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of units consumed: ");
		int units = sc.nextInt();
		double bill = 0;
		
		if (units>51) {
			bill += 50*3;
			
			if (units>201) {
				bill += 150*4.80;
				
				if (units>401) {
					bill += 200*5.80;
					
					bill += (units-400)*6.20;
					
					
				} else {
					bill += (units-200)*5.80;
				}
			} else {
				bill += (units-50)*4.80;
			}
		} else {
			bill += units*3;
		}
		
		System.out.println("Do you want to pay your bill online? (Y/N): ");
		char ch = sc.next().charAt(0);
		System.out.println("Total electricity Bill: Rs. "+bill);
		if ((ch=='Y') || (ch=='y')) {
			System.out.println("You recieved a 3% online payment discount of Rs. "+(bill*0.03));
			System.out.println("Amount Payable: Rs. "+(bill-(bill*0.03)));
		} else if ((ch=='N') || (ch=='n')) {
			System.out.println("Amount Payable: Rs. "+bill);
		} else {
			System.out.println("Invalid choice!!!");
		}
        
		sc.close();
	}
}

