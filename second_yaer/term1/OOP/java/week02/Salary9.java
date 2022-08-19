import java.util.Scanner;
public class Salary9{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter your salary : ");
        double n1 = sc.nextDouble();
        if(n1 > 50000.00){
            System.out.println(n1*0.9);
        }
        else{
            System.out.println(n1*0.95);
        }
        
    }
}