package homework;

import java.util.*;

public class Triangle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 lengths for the sides of a triangle: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a == b && b == c) {
            System.out.println("Equilateral");
        } else if (a >= (b + c) || c >= (b + a) || b >= (a + c)) {
            System.out.println("Not a triangle");
        } else if ((a == b && b != c) || (a != b && c == a) || (c == b && c != a)) {
            System.out.println("Isosceles");
        } else if (a != b && b != c && c != a) {
            System.out.println("Scalene");
        }
    }
}
