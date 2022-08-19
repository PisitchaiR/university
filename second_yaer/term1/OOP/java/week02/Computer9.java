import java.util.Scanner;
public class Computer9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double computer = 375.99;
        double allprice = computer;
        System.out.println("please insert your monitor size 38 or 43 only");
        int size = sc.nextInt();
        System.out.println("Do you want DVD-ROM? 1 Yes/ 0 is NO");
        int dvd = sc.nextInt();
        System.out.println("Do you want DVD-ROM? 1 Yes/ 0 is NO");
        int printer = sc.nextInt();
        System.out.println("======= Your order =======");
        System.out.println("* computer > > > 375.99$");
        if (size == 38){
            System.out.println("* 38'Moniter >>> 99.99$");
            allprice += 75.99;
        }
        else{
            System.out.println("* 43'Moniter >>> 99.99$");
            allprice += 99.99;
        }
        if (dvd == 1){
            System.out.println("* DVD-ROM >>> 65.99$");
            allprice += 65.99;
        }
        if (printer == 1){
            System.out.println("* printer >>> 125.00$");
            allprice += 125;
        }
        System.out.println("======= TOtal price >>> "+allprice+ " =======");
    }
}
