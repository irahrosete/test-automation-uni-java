package chapter3;

import java.util.Scanner;

public class LoanQualifier {
    public static void main(String[] args) {
        int requiredSalary = 30000;
        int requiredYearsEmployed = 2;

        System.out.println("Enter your salary");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("Enter number of years employed");
        double years = scanner.nextDouble();

        if (salary >= requiredSalary) {
            if (years >= requiredYearsEmployed) {
                System.out.println("Congrats! You qualify for the loan");
            }
            else {
                System.out.println("Sorry, you must have worked for at least " + requiredYearsEmployed + " years");
            }
        }
        else {
            System.out.println("Sorry, you must earn at least " + requiredSalary
                    + " to qualify");
        }
    }
}
