package Employee;

public class Employee {


    private String empName;
    private final String empCompany;
    private final int age;
    private final int zp;

    public Employee() {
        this.empName = ArrNameandComp.arrName();
        this.empCompany = ArrNameandComp.arrCompany();
        this.age = Age.getRandomAge();
        this.zp = Salary.getRandomZp();
    }

    public Employee(String empName, String empCompany, int age, int zp) {
        this.empCompany = empCompany;
        this.age = age;
        this.zp = zp;
    }

    @Override
    public String toString() {
        return "\nEmployee\n________" +
                "\nName = " + empName +
                "\nCompany = " + empCompany  +
                "\nAge = " + age +
                "\nSalary = " + zp + "$";
    }
}