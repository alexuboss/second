package homework;

import java.util.Scanner;

public class conditionale {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduceti un numar: ");

        int num = sc.nextInt();
        System.out.print("Introduceti un alt numar: ");

        int num2 = sc.nextInt();
        if (num < num2) {
            System.out.println("Numarul cel mai mare este " + num2 + ".");
        } else if (num > num2) {
            System.out.println("Numarul cel mai mare este " + num);
        } else if (num2 == num) {
            System.out.println("Numerele sunt egale, introduceti diferite valori");
        }
    }
}
