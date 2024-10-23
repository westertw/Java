package PhoneSort;

import java.util.Comparator;
import java.util.List;


public class Application {
    public static void main(String[] args) {

        List<Phone> phones = Phone.generateRandomPhones(30);

        phones.sort(Comparator.comparingDouble(Phone::getPrice));
        System.out.println("Телефоны, отсортированные по цене:");
        for (Phone phone : phones) {
            System.out.println(phone);
        }

        phones.sort(Comparator.comparingDouble(Phone::getWeight));
        System.out.println("Телефоны, отсортированные по весу:");
        for (Phone phone : phones) {
            System.out.println(phone);
        }
    }

}
