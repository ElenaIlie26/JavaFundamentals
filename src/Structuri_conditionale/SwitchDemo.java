package Structuri_conditionale;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti nr: ");
        int n = sc.nextInt();
        switch (n){
            case 1:
                System.out.println(" introdus 1");
                break;
            case 2:
                System.out.println("introdus 2");
                break;
            default:
                System.out.println("altceva");

        }
    }
}
