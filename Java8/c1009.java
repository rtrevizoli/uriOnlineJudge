import java.util.Scanner;

public class c1009 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String EFN = scan.nextLine();
        double SS = scan.nextDouble(),
        TVS = scan.nextDouble();

        System.out.printf("TOTAL = R$ %.2f\n", (SS+TVS*0.15f));
    }
}