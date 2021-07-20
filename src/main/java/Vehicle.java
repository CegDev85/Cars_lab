public abstract class Vehicle {

    private String make;
    private String model;
    private int year;
    private double price;
    private String registration;
    private String colour;
    private int doors;

    public Vehicle(String make, String model, int year, double price, String registration, String colour, int doors) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
        this.registration = registration;
        this.colour = colour;
        this.doors = doors;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public String drive(){
        return "Vrooom";
    }



}
