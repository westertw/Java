package OOP.Climbers;

public class MountainUp {

    public static void main(String[] args) {

        Climber climber1 = new Climber("Виктор", "28", "123");
        Climber climber2 = new Climber("Юрий", "27", "321");
        Climber climber3 = new Climber("Игорь", "29", "010");
        Climber climber4 = new Climber("Георгий", "25", "000");
        Climber climber5 = new Climber("Джоанна", "26", "017");
        Climber climber6 = new Climber("Хихин", "18", "111");

        Mountains mountains1 = new Mountains("Белуха", "Россия", "5193");
        Mountains mountains2 = new Mountains("Эльбрус", "Россия", "5642");
        Mountains mountains3 = new Mountains("Казбек", "Россия", "5033");


        System.out.println(" 1 группа:" + climber1 + climber2 + climber3 + mountains1);
        System.out.println(" 2 группа:" + climber4 + climber5 + climber6 + mountains2);

    }

}
