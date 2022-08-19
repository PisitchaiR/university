package week02;
import java.util.Scanner;

public class Bank11{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Scanner sc1 = new Scanner (System.in);
        System.out.print("Input your money : ");
        int n1 = sc.nextInt();
        System.out.print("Input your account type (Please type A B C or X in account) : ");
        String bank = sc1.nextLine();
        if (bank.equals("A")){
            System.out.println("Your total money in one year = "+(n1 + (n1*0.015)));
        }
        if (bank.equals("B")){
            System.out.println("Your total money in one year = "+(n1*1.02));
        }
        if (bank.equals("C")){
            System.out.println("Your total money in one year = "+(n1 + (n1*0.015)));
        }
        if (bank.equals("X")){
            System.out.println("Your total money in one year = "+(n1*1.05));
        }
    }
}