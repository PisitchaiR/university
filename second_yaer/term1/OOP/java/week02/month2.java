import java.util.Scanner;
public class month2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a Month ID: ");
        int num = sc.nextInt();
        switch (num){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.print("31 Days");
                break;
            case 4: case 6: case 9: case 11:
                System.out.print("30 Days");
            default:
                System.out.print("28 Days");
        }
    }
}
