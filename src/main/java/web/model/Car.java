package web.model;

public class Car {

    private String colour;

    private String model;

    private int age;

    public Car(String colour, String model, int age) {
        this.colour = colour;
        this.model = model;
        this.age = age;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
