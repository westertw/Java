package Basics;

public class Gym {

        public static void main(String[] args) {

            for (int d = 1; d <= 5; d++) {
                System.out.println("круг " + d);
                if (d % 2 == 0) {
                    for (int a = 1; a <= 3; a++) {
                        System.out.println("приседаем " + a);
                    }
                }
                else
                    for (int c = 1; c <= 3; c++) {
                        System.out.println("отжимаемся " + c);
                    }
                for (int b = 1; b <= 7; b++) {
                    System.out.println("качаем пресс " + b);
                }
                System.out.println("хороший темп, так держать!");
            }
        }
    }


