package week02;

import java.util.*;

public class Salary10 {
    public static void main(String[] agrs) {
        double salary = 0, salaryBonus = 0;
        Scanner input = new Scanner(System.in);
        Scanner inputStr = new Scanner(System.in);
        System.out.print("Please insert your name : ");
        String name = inputStr.next();
        System.out.print("Please insert your age : ");
        int age = input.nextInt();
        System.out.print("Please insert number of working days : ");
        int numDay1 = input.nextInt();
        System.out.print("Please insert number of absent days : ");
        int numDay2 = input.nextInt();
        System.out.print("Please insert your body weight : ");
        double weight = input.nextDouble();

        if (age >= 21 && age <= 30) {
            salary = (numDay1 * 300) - (numDay2 * 50);
        } else if (age >= 31 && age <= 40) {
            salary = (numDay1 * 500) - (numDay2 * 50);
        } else if (age >= 41 && age <= 50) {
            salary = (numDay1 * 1000) - (numDay2 * 25);
        } else if (age >= 51 && age <= 60) {
            salary = (numDay1 * 3000);
        }
        
        if (weight >= 10 && weight <= 60) {
            salaryBonus = salary + 5000;
        } else if (weight >= 61 && weight <= 90) {
            salaryBonus = salary + (5000-((weight-60)*10));
        } else {
            salaryBonus  =salary;
        }

        System.out.println("Hi, " + name);
        System.out.println("Your salary is "+salary+"Baht");
        System.out.println("Your salary and bonus is "+salaryBonus+"Baht");

        input.close();
        inputStr.close();
    }
}