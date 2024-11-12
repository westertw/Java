package Products;

public class Application {    public static void main(String[] args) {
    MyProducts myProducts = new MyProducts(100.0, 50.0, 200.0, 500.0);
    Product product1 = new Product("Яблоко", 0.3, 0.2, 14.0, 52.0);
    Product product2 = new Product("Банан", 1.1, 0.3, 23.0, 96.0);
    Product product3 = new Product("Курица", 31.0, 3.6, 0.0, 165.0);
    Product product4 = new Product("Молоко", 3.4, 3.6, 4.8, 64.0);
    Product product5 = new Product("Рис", 2.7, 0.3, 28.0, 130.0);
    Product product6 = new Product("Шоколад", 7.6, 30.0, 59.0, 546.0);
    System.out.println(myProducts.addProduct(product1));
    System.out.println(myProducts.addProduct(product2));
    System.out.println(myProducts.addProduct(product3));
    System.out.println(myProducts.addProduct(product4));
    System.out.println(myProducts.addProduct(product5));
    System.out.println(myProducts.addProduct(product6));
    }
}
