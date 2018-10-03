package homework;

import java.util.Scanner;

public class conditionale2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduceti un numar: ");
        int num1 = sc.nextInt();

        System.out.print("Introduceti un alt numar: ");
        int num2 = sc.nextInt();

        System.out.print("Introduceti un al treilea numar: ");
        int num3 = sc.nextInt();

        if (num1 == num2 || num1 == num3 || num2 == num3) {
            System.out.println("Ati introdus numerele egale, introduceti diferite valori");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("Numarul cel mai mare este " + num2 + ".");
        } else if (num3 > num1 && num3 > num2) {
            System.out.println("Numarul cel mai mare este " + num3 + ".");
        } else if (num1 > num2 && num1 > num3) {
            System.out.println("Numarul cel mai mare este " + num1 + ".");
        }
    }
}
