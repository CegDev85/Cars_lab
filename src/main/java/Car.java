import behaviours.IFuel;
import behaviours.IIgnition;

public class Car extends Vehicle implements IFuel, IIgnition {


    public Car(String make, String model, int year, double price, String registration, String colour, int doors) {
        super(make, model, year, price, registration, colour, doors);
    }

    @Override
    public String fuel() {
        return "Tank full";
    }

    public String ignition(){
        return "Engine on";
    }

}
