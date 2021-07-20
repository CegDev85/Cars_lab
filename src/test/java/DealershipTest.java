import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Dealership dealership;
    Car car;

    @Before
    public void before(){
        dealership = new Dealership(100000);
        car = new Car("Suzuki","Swift",2005,1500,"DS05TTU","Beige",5);

    }

    @Test
    public void canBuyCar(){
        dealership.buyCar(car);
        assertEquals(1, dealership.getDealersCars().size());
    }

    @Test
    public void buyingCarReducesFunds(){
        dealership.buyCar(car);
        assertEquals(98500.00, dealership.getTill(), 0.0);
    }

    @Test
    public void sellingCarIncreasesFunds(){
        dealership.sellCar(car);
        assertEquals(101500.00, dealership.getTill(), 0.0);
    }


}
