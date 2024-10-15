package Calculator;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Меню калькулятора:");
            System.out.println("1. Сложение");
            System.out.println("2. Вычитание");
            System.out.println("3. Умножение");
            System.out.println("4. Деление");
            System.out.println("5. Выход");

            System.out.print("Выберите действие: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addition(scanner);
                    break;
                case 2:
                    subtraction(scanner);
                    break;
                case 3:
                    multiplication(scanner);
                    break;
                case 4:
                    division(scanner);
                    break;
                case 5:
                    System.out.println("Выходим...");
                    return;
                default:
                    System.out.println("Ошибка. Попробуйте еще раз.");
            }
        }
    }

    private static void addition(Scanner scanner) {
        System.out.print("Введите 1 число: ");
        double num1 = scanner.nextDouble();
        System.out.print("Введите 2 число: ");
        double num2 = scanner.nextDouble();

        double result = Math.round(num1 + num2);
        System.out.println("Результат: " + result);
    }

    private static void subtraction(Scanner scanner) {
        System.out.print("Введите 1 число: ");
        double num1 = scanner.nextDouble();
        System.out.print("Введите 2 число: ");
        double num2 = scanner.nextDouble();

        double result = Math.round(num1 - num2);
        System.out.println("Результат: " + result);
    }

    private static void multiplication(Scanner scanner) {
        System.out.print("Введите 1 число: ");
        double num1 = scanner.nextDouble();
        System.out.print("Введите 2 число: ");
        double num2 = scanner.nextDouble();

        double result = Math.round(num1 * num2);
        System.out.println("Результат: " + result);
    }

    private static void division(Scanner scanner) {
        System.out.print("Введите 1 число: ");
        double num1 = scanner.nextDouble();
        System.out.print("Введите 2 число: ");
        double num2 = scanner.nextDouble();
        if (num2 == 0) {
            System.out.println("Ошибка: На ноль делить нельзя!");
        } else {
            double result = Math.round(num1 / num2);
            System.out.println("Результат: " + result);
        }
    }
}
