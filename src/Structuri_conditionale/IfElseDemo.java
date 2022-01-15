package Structuri_conditionale;

import java.util.Scanner;

public class IfElseDemo {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int numar = scanner.nextInt();
       // int n = 6;
        if (numar>3){
            System.out.println("e mai mare");
        }
        else {
            System.out.println("e mai mic");
        }
    }
}
