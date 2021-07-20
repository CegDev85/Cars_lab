import java.util.ArrayList;

public class Dealership implements IExchange {

    private ArrayList<Vehicle> dealersCars;
    private double till;


    public Dealership( double till) {
        this.dealersCars = new ArrayList<>();
        this.till = till;
    }

    public ArrayList<Vehicle> getDealersCars() {
        return dealersCars;
    }

    public double getTill() {
        return till;
    }

    @Override
    public void buyCar(Vehicle vehicle) {
        getDealersCars().add(vehicle);
        this.till = getTill() - vehicle.getPrice();
    }

    @Override
    public void sellCar(Vehicle vehicle) {
        getDealersCars().remove(vehicle);
        this.till = getTill() + vehicle.getPrice();

    }

}
