package Products;

import java.util.ArrayList;
import java.util.List;

public class MyProducts {

    private double maxProtein;
    private double maxFat;
    private double maxCarbohydrates;
    private double maxCalories;

    private List<Product> products;

    public MyProducts(double maxProtein, double maxFat, double maxCarbohydrates, double maxCalories) {
        this.maxProtein = maxProtein;
        this.maxFat = maxFat;
        this.maxCarbohydrates = maxCarbohydrates;
        this.maxCalories = maxCalories;
        this.products = new ArrayList<>();
    }

    public String addProduct(Product product) {
        if (product.getProtein() > maxProtein) {
            return "Продукт" + product.getName() + " не может быть добавлен: слишком много белков";
        }
        if (product.getFat() > maxFat) {
            return "Продукт " + product.getName() + " не может быть добавлен: слишком много жиров";
        }
        if (product.getCarbohydrates() > maxCarbohydrates) {
            return "Продукт " + product.getName() + " не может быть добавлен: слишком много углеводов";
        }
        if (product.getCalories() > maxCalories) {
            return "Продукт " + product.getName() + " не может быть добавлен: слишком много калорий";
        }
        product.add(product);
        return "Продукт " + product.getName() + " добавлен";
    }

    public List<String> getProductNames() {
        List<String> names = new ArrayList<>();
        for (Product product : products) {
            names.add(product.getName());

        }
        return names;
    }
    }

