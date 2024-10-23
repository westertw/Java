package PhoneSort;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Phone {
    private String serialNumber;
    private String model;
    private double weight;
    private double price;

    public Phone(String serialNumber, String model, double weight, double price) {
        this.serialNumber = serialNumber;
        this.model = model;
        this.weight = weight;
        this.price = price;
    }
    @Override
    public String toString() {
        return "Телефон {" +
                "Серийный номер = '" + serialNumber + '\'' +
                ", Модель = '" + model + '\'' +
                ", Вес = " + String.format("%.0f", weight) + "g" +
                ", Цена = " + String.format("%.0f", price) + "$" +
                '}';
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    public static List<Phone> generateRandomPhones(int count) {
        List<Phone> phones = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < count; i++) {
            String serialNumber = "SG" + String.format("%04d", random.nextInt(10000));
            String model = "Model" + (i + 1);
            double weight = 100 + (random.nextDouble() * 200);
            double price = 50 + (random.nextDouble() * 500);

            phones.add(new Phone(serialNumber, model, weight, price));
        }

        return phones;
    }
}
