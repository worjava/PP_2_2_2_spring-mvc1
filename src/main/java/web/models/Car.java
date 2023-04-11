package web.models;

public class Car {
    private int id;
    private String name;

    private int year_production;



    public Car(int id, String name, int year_production) {
        this.id = id;
        this.name = name;
        this.year_production = year_production;
    }


    public Car() {
    }
    public int getId() {
        return id;
    }



    public String getName() {
        return name;
    }

    public int getYear_production() {
        return year_production;
    }

}
