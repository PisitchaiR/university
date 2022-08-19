import java.util.Scanner;
public class Plus7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Plase insert a number : ");   
        int num = sc.nextInt();
        for(int i = 0; i < num ; i++){
            System.out.print("| ");
            if((i % 5 == 0) && (i != 0)){
                System.out.println("");
            }
        }     
    }
}
