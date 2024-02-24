package Basics;
import java.util.Scanner;

public class Floors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер квартиры: ");
        int flatNumber = scanner.nextInt();

        int floor = (int) Math.ceil((double) flatNumber / 4); // Вычисляем этаж, где находится квартира
        int position = (flatNumber - 1) % 4; // Вычисляем положение квартиры

        System.out.println("Квартира находится на " + floor + " этаже");
        if (position == 0) {
            System.out.println("Квартира находится слева от лифта");
        } else if (position == 1) {
            System.out.println("Квартира дальняя слева");
        } else if (position == 2) {
            System.out.println("Квартира дальняя справа");
        } else {
            System.out.println("Квартира находится справа от лифта");
        }
    }
}