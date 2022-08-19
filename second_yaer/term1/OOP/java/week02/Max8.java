import java.util.Scanner;
public class Max8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int maxx = 0;
        while (true){
            int num = sc.nextInt();
            if (num == -1){
                break;
            }
            if (num > maxx){
                maxx = num;
            }
        }
        System.out.println(maxx + " is maximum number");
    }
}
