package lab3;

import java.util.Scanner;

public class Analyzer {

	public static void main(String[] args) {
		Data myInfo = new Data();
		
		Scanner scan = new Scanner(System.in);
		
		
		
		while (true) {
			System.out.println("Enter number (Q to quit): ");
			if (scan.hasNextDouble()) {
				double num = scan.nextDouble();
				myInfo.add(num);
			}else {
				String input = scan.next();
				if (input.equals("Q")) break;
				else  System.out.print("Invalid input");
				
			}
		}
		
		
		myInfo.getInfo();
		
    }
}
