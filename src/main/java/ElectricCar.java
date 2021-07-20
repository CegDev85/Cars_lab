import behaviours.ICharge;

public class ElectricCar extends Vehicle implements ICharge {

    public ElectricCar(String make, String model, int year, double price, String registration, String colour, int doors) {
        super(make, model, year, price, registration, colour, doors);
    }


    @Override
    public String charge() {
        return "Fully charged";
    }

    public String switchOn(){
        return "Battery on";
    }
}
