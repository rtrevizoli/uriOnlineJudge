import java.util.Scanner;

public class c1008 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int EN = scan.nextInt(),
        WHA = scan.nextInt();
        double EH = scan.nextDouble();

        System.out.println("NUMBER = " + EN);
        System.out.printf("SALARY = U$ %.2f\n", (WHA*EH));
    }
}