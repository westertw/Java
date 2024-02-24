package Exam;
import java.util.Scanner;
import java.math.BigDecimal;

public class FinancialCalculator {
    public static void main(String[] args) {

        BigDecimal[] costs = new BigDecimal[30];
        Scanner input = new Scanner(System.in);

        int choice;
        do {
            System.out.println("1 - ввести расходы за определенный день");
            System.out.println("2 - траты за месяц");
            System.out.println("3 - самая большая сумма расхода за месяц");
            System.out.println("0 - выход");
            System.out.println("выберите пункт меню:");
            choice = input.nextInt();

            switch (choice) {

                case 1:
                    enterCosts(costs, input);
                    break;
                case 2:
                    displayCosts(costs);
                    break;
                case 3:
                    displayMaxCosts(costs);
                    break;
                case 0:
                    System.out.println("всего хорошего!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("неверный выбор, попробуйте снова");
                    break;
            }
        } while (true);
    }

    public static void enterCosts(BigDecimal[] costs, Scanner input) {
        System.out.println("введите день: ");
        int day = input.nextInt();
        System.out.println("введите сумму трат:");
        BigDecimal sum = input.nextBigDecimal();

        if (costs[day - 1] != null) {
            System.out.println("на этот день уже указана сумма " + costs[day - 1]);
            System.out.println("перезаписать? (y/n)");
            String overwrite = input.next();
            if (overwrite.equalsIgnoreCase("y")) {
                costs[day - 1] = sum;
            }
        } else {
            costs[day - 1] = sum;
        }
        System.out.print("добавить траты за другой день? (y/n) ");
        String add = input.next();
        if (add.equalsIgnoreCase("y")) {
            enterCosts(costs, input);
        }
    }
    public static void displayCosts(BigDecimal[] costs) {
        for (int i = 0; i < costs.length; i++) {
            if (costs[i] != null ) {
                System.out.println((i + 1) + " день - " + costs[i] + " руб");
            }
        }
        System.out.println();
    }

    public static void displayMaxCosts(BigDecimal[] costs) {
        BigDecimal maxCosts = BigDecimal.ZERO;
        int dayOfMaxCosts = 0;

        for (int i = 0; i < costs.length; i++) {
            if (costs[i] != null && costs[i].compareTo(maxCosts) == 0) {
                maxCosts = costs[i];
                dayOfMaxCosts = i + 1;
            }
        }
        if (dayOfMaxCosts != 0) {
            System.out.println(dayOfMaxCosts + " день -" + maxCosts + " руб");
        } else {
            System.out.println("расходы за месяц не указаны");
        }
        System.out.println();
    }
}