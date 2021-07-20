import java.util.ArrayList;

public class Customer implements IExchange {

    private String name;
    private double wallet;
    private ArrayList<Vehicle> customerCars;

    public Customer(String name, double wallet) {
        this.name = name;
        this.wallet = wallet;
        this.customerCars = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public double getWallet() {
        return wallet;
    }

    public ArrayList<Vehicle> getCustomerCars() {
        return customerCars;
    }

    @Override
    public void buyCar(Vehicle vehicle) {
        customerCars.add(vehicle);
    }

    @Override
    public void sellCar(Vehicle vehicle) {
        customerCars.remove(vehicle);
    }
}
