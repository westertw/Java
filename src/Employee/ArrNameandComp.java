package Employee;

import java.util.Random;

public class ArrNameandComp {

    public static String arrCompany(){

        String[] arrCompany = new  String[10];
        arrCompany[0] = "Apple";
        arrCompany[1] = "Microsoft";
        arrCompany[2] = "Samsung";
        arrCompany[3] = "Redmond";
        arrCompany[4] = "Acer";
        arrCompany[5] = "Asus";
        arrCompany[6] = "Nvidia";
        arrCompany[7] = "AMD";
        arrCompany[8] = "Intel";
        arrCompany[9] = "Porsche";
        Random rand = new Random();

        return (arrCompany[rand.nextInt(arrCompany.length)]);
    }

    public static String arrName() {

        String[] arrName = new String[10];
        arrName[0] = "Maksim";
        arrName[1] = "Ivan";
        arrName[2] = "Sergey";
        arrName[3] = "Semen";
        arrName[4] = "Andrey";
        arrName[5] = "Yuri";
        arrName[6] = "Alisa";
        arrName[7] = "Polina";
        arrName[8] = "Alina";
        arrName[9] = "Sonya";
        Random rand = new Random();

        return (arrName[rand.nextInt(arrName.length)]);
    }

}
