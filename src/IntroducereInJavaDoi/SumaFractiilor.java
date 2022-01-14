package IntroducereInJavaDoi;

import java.util.Scanner;

public class SumaFractiilor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        double Sum = 0;
        for ( int i = 1; i<=n; i++){
            Sum = Sum + (double)1/i;
        }
        System.out.println(Sum);
    }
}
