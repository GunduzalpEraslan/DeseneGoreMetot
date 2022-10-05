import java.util.Scanner;
import java.util.regex.Pattern;

public class DeseneGoreMetot {
    public static void Pattern(int pattern) {
        System.out.print( pattern + " ");

        if (0< pattern) {
            Pattern(pattern-5);
            System.out.print(pattern + " ");
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Sayı giriniz : ");
        int pattern= scan.nextInt();

        System.out.print("Pattern:");
        Pattern(pattern);
    }
}
