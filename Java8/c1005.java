import java.util.Scanner;

public class c1005 {

    public static void main(String[] args) {

        double A, B;

        Scanner scan = new Scanner(System.in);

        A = scan.nextDouble();
        B = scan.nextDouble();

        System.out.printf("MEDIA = %.5f\n", ((3.5f*A+7.5f*B)/11f));

    }
}