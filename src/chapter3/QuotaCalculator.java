package chapter3;

import java.util.Scanner;

public class QuotaCalculator {
    public static void main(String[] args) {
        int quota = 10;

        System.out.println("Enter number of sales");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        if (sales >= quota) {
            System.out.println("Congrats! You've met you quota!");
        }
        else {
            int salesShort = quota - sales;
            System.out.println("You did not meet quota. You were out by " + salesShort);
        }


    }
}
