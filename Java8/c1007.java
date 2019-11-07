import java.util.Scanner;

public class c1007 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt(),
        B = scan.nextInt(),
        C = scan.nextInt(),
        D = scan.nextInt();

        System.out.println("DIFERENCA = " + (A*B-C*D));
    }
}