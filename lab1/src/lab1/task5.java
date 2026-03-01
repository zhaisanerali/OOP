package lab1;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
     

        Scanner scanner = new Scanner(System.in);
        
        double balance = 50000;
        double interestRate = 0.10; 
        
        System.out.println("Initial balance: " + balance);
        
        double interest = balance * interestRate;
        double newBalance = balance + interest;
        
        System.out.println("Interest added: " + interest);
        System.out.println("New balance: " + newBalance);
        
        scanner.close();
    }
}