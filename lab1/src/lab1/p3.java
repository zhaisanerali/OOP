package lab1;

import java.util.Scanner;

public class p3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your mark: ");
		double mark = scan.nextInt();
		
		if (mark < 49.5 && mark >= 0) {
			System.out.print("F");
		}
		else if (mark >= 49.5 && mark < 54.5) {
			System.out.print("D");
		}
		else if (mark >=  54.5 && mark < 59.5) {
			System.out.print("D+");
		}
		else if (mark >= 59.5 && mark < 64.5 ){
			System.out.print("C-");
		}
		else if (mark >= 64.5 && mark < 69.5) {
			System.out.print("C");
		}
		else if (mark >= 69.5 && mark < 74.5) {
			System.out.print("C+");
		}
		else if (mark >= 79.5 && mark <84.5) {
			System.out.print("B-");
		}
		else if (mark > 84.5 && mark <= 89.5 ) {
			System.out.print("B");
		}
		else if (mark >= 89.5 && mark < 94.5) {
			System.out.print("B+");
		}
		else if (mark >= 94.5 && mark <= 100) {
			System.out.print("A");
		}

	}

}
