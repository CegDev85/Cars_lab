import behaviours.ICharge;
import behaviours.IFuel;

public class HybridCar extends Vehicle implements ICharge, IFuel {


    public HybridCar(String make, String model, int year, double price, String registration, String colour, int doors) {
        super(make, model, year, price, registration, colour, doors);
    }


    @Override
    public String charge() {
        return "Battery full";
    }


    @Override
    public String fuel() {
        return "Tank full";
    }

    public String ignition(){
        return "Engine on";
    }

}
