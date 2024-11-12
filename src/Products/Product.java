package Products;
public class Product {

    private String name;
    private double protein;
    private double fat;
    private double carbohydrates;
    private double calories;

    public Product(String name) {
        this(name, 0.0, 0.0, 0.0, 0.0);
    }

    public Product(String name, double protein, double calories) {
        this(name, protein, 0.0, 0.0, calories);
        }


    public Product(String name, double protein, double fat, double carbohydrates) {
        this(name, protein, fat, carbohydrates, 0.0);
    }


    public Product(String name, double protein, double fat, double carbohydrates, double calories) {
        if(protein < 0 || fat < 0 || carbohydrates < 0 || calories < 0) {
            throw new IllegalAccessException("Нельзя использовать отрицательные значения");
        }
        this.name = name;
        this.protein = protein;
        this.fat = fat;
        this.carbohydrates = carbohydrates;
        this.calories = calories;
        }

    public String getName() {
        return name;
    }

    public double getProtein() {
        return protein;
    }

    public double getFat() {
        return fat;
    }

    public double getCarbohydrates() {
        return carbohydrates;
    }

    public double getCalories() {
        return calories;
    }
}


