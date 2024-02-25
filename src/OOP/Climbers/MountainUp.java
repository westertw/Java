package OOP.Climbers;

public class MountainUp {

    public static void main(String[] args) {

        Climber climber1 = new Climber("Viktor", "28", "123");
        Climber climber2 = new Climber("Yuri", "27", "321");
        Climber climber3 = new Climber("Igor", "29", "010");

        Mountains mountains1 = new Mountains("Beluha", "Russia", "5193");
        Mountains mountains2 = new Mountains("Elbrus", "Russia", "5642");
        Mountains mountains3 = new Mountains("Kazbek", "Russia", "5033");

        Groups group1 = new Groups(mountains1);
        group1.addClimber(climber1);
        group1.addClimber(climber2);
        group1.addClimber(climber3);
        System.out.println("1 группа" + group1 + "гора" + mountains1);

    }

}
