import java.util.Scanner;

public class c1006 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double A = scan.nextDouble(),
        B = scan.nextDouble(),
        C = scan.nextDouble();

        System.out.printf("MEDIA = %.1f\n", ((2*A+3*B+5*C)/10));

    }
}