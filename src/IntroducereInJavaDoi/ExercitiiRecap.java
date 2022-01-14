package IntroducereInJavaDoi;

import java.util.Scanner;

public class ExercitiiRecap {

    private static boolean isPrime( int n) {

        for (int possibleDivisor = 2; possibleDivisor < n; possibleDivisor++) {
            if (n % possibleDivisor == 0) {
                return false;
            }
        }
        return true;
    }

            public static void main (String[]args){
                System.out.println("Hello");

                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();

                for (int i = 2; i < n; i++) {
                    if (isPrime(i)) {
                        System.out.println(i);
                    }
                }
            }
        }
