package Employee;

import java.util.Random;

public class Age {

    public static int getRandomAge(){
        Random rn = new Random();
        int maximum = 65;
        int minimum = 18;
        return (rn.nextInt(maximum - minimum + 1) + minimum);
    }
}
