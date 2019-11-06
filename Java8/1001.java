import java.util.Scanner;

public class myClass {
    public static void main(String[] args) {

        int A, B;
        
        Scanner scan = new Scanner(System.in);

        A = scan.nextInt();
        B = scan.nextInt();

        System.out.println("X = " + (A+B));
    }
}