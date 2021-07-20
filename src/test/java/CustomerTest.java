import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    Car car;

    @Before
    public void before(){
        customer = new Customer("Jesus",10000);
        car = new Car("Subaru","Impreza",1999,3000,"WWJD420","White",5);

    }

    @Test
    public void hasNoCar(){
        assertEquals(0,customer.getCustomerCars().size());
    }

    @Test
    public void canBuyCar(){
        customer.buyCar(car);
        assertEquals(1,customer.getCustomerCars().size());
    }

    @Test
    public void canSellCar(){
        customer.buyCar(car);
        customer.buyCar(car);
        customer.sellCar(car);
        assertEquals(1,customer.getCustomerCars().size());
    }

}
