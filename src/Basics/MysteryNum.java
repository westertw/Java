package Basics;
import java.util.Scanner;

public class MysteryNum {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int secretNumber = (int)(Math.random() * 9) + 1;
            int attempts = 3;
            while (attempts > 0) {
                System.out.println("Угадай число от 1 до 9");

                int usernum = scanner.nextInt();
                if (usernum < 1 || usernum > 9) {
                    System.out.println("неверное число");
                    continue;
                }
                if (usernum == secretNumber) {
                    System.out.println("поздравляю, вы угадали!");
                    break;
                }
                attempts--;
                if (usernum < secretNumber) {
                    System.out.println("загаданное число больше");

                }
                else {
                    System.out.println("загаданное число меньше");
                    attempts--;
                }
                if (attempts == 0) {
                    System.out.println("попытки закончились");
                    attempts--;
                }
            }
        }
    }

