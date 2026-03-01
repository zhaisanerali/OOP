package lab1;

import java.util.Scanner;

public class task4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введите a, b, c: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double D = b * b - 4 * a * c;

        if (D < 0) {
            System.out.println("Error");
        } else {
            
            double sqrtD = Math.sqrt(D);
            double divisor = 2 * a;

            if (D == 0) {
                double x = -b / divisor;
                System.out.println("only one root" + x);
            } else {
         
                double x1 = (-b + sqrtD) / divisor;
                double x2 = (-b - sqrtD) / divisor;
                System.out.println("Корни уравнения:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }
        
        scanner.close();
    }
}