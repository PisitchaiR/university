import java.util.Scanner;
public class EvenOdd5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int even = 0;
        int odd = 0;
        int num;
        while(true){
            num = sc.nextInt();
            if (num == -1){
                break;
            }
            if ((num % 2 == 0)){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("Odd number = "+odd+" and Even number = "+even);
    }
}
