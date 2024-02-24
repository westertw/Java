package Basics;
import java.util.Scanner;

public class Ticket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите шестизначный номер билета: ");
        int ticketNumber = scanner.nextInt();

        int digit6 = ticketNumber % 10;
        int digit5 = (ticketNumber / 10) % 10;
        int digit4 = (ticketNumber / 100) % 10;
        int digit3 = (ticketNumber / 1000) % 10;
        int digit2 = (ticketNumber / 10000) % 10;
        int digit1 = (ticketNumber / 100000) % 10;

        if ((digit1 + digit2 + digit3) == (digit4 + digit5 + digit6) &&
                (digit1 + digit2 + digit3) % 2 == 0 && (digit4 + digit5 + digit6) % 2 == 0) {
            System.out.println("У вас счастливый билет!");
        } else {
            System.out.println("У вас обычный билет.");
        }
    }
}