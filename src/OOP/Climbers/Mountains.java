package OOP.Climbers;

public class Mountains {

    private String name;

    private String country;

    private String height;

public Mountains(String name, String country, String height) {
    this.name = name;
    this.country = country;
    this.height = height;
}
    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country){
        this.country = country;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height){
        this.height = height;
    }

}
