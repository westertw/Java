package Basics;
import java.util.Scanner;

public class Year {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("введите четырехзначное число ");
        int chislo = in.nextInt();

        if (chislo >= 1910 && chislo < 2025) {
            int century = (chislo - 1) / 100 + 1;
            System.out.println("данный год относится к " + century + " веку");
        } else {
            System.out.println("ввдеденое значение не является одним из годов из указанного диапазона");
        }
    }
}
