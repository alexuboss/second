package homework;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class conditionale3a {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduceti un numar intreg (pozitiv sau negativ)\nin afara de 0: ");
        
        int num = sc.nextInt();

        if (num >= 1) {
            System.out.println("Ati introdus numar pozitiv.");
        } else if (num < 0) {
            System.out.println("Ati introdus numar negativ.");
            } else if (num == 0) {
            System.out.println("Ati introdus 0(zero).");
        }
    }
}
