package homework;

import java.util.Scanner;

public class minutesToh {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input the number of minutes: ");
        long minutesInYear = 60 * 24 * 365;
        long min = input.nextLong();

        int years = (int) (min / minutesInYear);
        int days = (int) (min / 60 / 24) % 365;

        System.out.println((int) min + " minutes is approximately " + years + " years and " + days + " days");
    }
}
