package OOP;
import java.util.Scanner;

public class Costs {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("введите размер зарплаты ");
        int salary = scanner.nextInt();

        if (salary < 0) {
            System.out.println("зарплата не может быть отрицательной");
            return;
        }


        System.out.print("введите планируемые затраты на транспорт ");
        int transportCost = scanner.nextInt();

        if (transportCost > salary){
            System.out.println("затраты на транспорт не могут быть больше зарплаты");
            return;
        }


        System.out.print("введите планируемые затраты на еду ");
        int foodCost = scanner.nextInt();

        if (foodCost > salary){
            System.out.println("затраты на еду не могут быть больше зарплаты");
            return;
        }

        System.out.print("введите сумму возможных сбережений ");
        int savings = scanner.nextInt();

        Budget(salary, transportCost, foodCost, savings);
    }

    public static void Budget(int salary, int transportCost, int foodCost, int savings) {
        int plannedExpenses = transportCost + foodCost;
        int balance = salary - plannedExpenses - savings;

        if (balance > 0) {
            System.out.println("излишек средств: " + balance);
            System.out.println("можно позволить себе дополнительные траты или увеличить сумму сбережений");
        } else if (balance < 0) {
            System.out.println("недостаток средств: " + balance);
            System.out.println("необходимо пересмотреть расходы или увеличить доходы");
        } else {
            System.out.println("расходы соответствуют зарплате");
        }
    }
}
