package Employee;

public class Salary {

    public static int getRandomZp() {
        int min= 1000;
        int max=10000;
        return min + (int)(Math.random() * ((max - min) + 1));
    }
}