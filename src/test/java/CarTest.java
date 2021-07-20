import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {

    Car car;

    @Before
    public void before() {
        car = new Car("Toyota", "Yaris", 1999, 2000, "SB02XYL", "Blue", 5);
    }

    @Test
    public void hasMake() {
        assertEquals("Toyota", car.getMake());
    }

    @Test
    public void hasPrice() {
        assertEquals(2000, car.getPrice(), 0.0);
    }

    @Test
    public void canFuel(){
        assertEquals("Tank full", car.fuel());
    }

    @Test
    public void canIgnition(){
        assertEquals("Engine on",car.ignition());
    }




}


