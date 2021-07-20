import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HybridCarTest {

    HybridCar hybridCar;

    @Before
    public void before(){
        hybridCar = new HybridCar("Toyota","Prius",2010,5000,"SD10YTL","Yellow",3);
    }

    @Test
    public void hasColour(){
        assertEquals("Yellow", hybridCar.getColour());
    }

    @Test
    public void canCharge(){
        assertEquals("Battery full", hybridCar.charge());
    }

    @Test
    public void canFuel(){
        assertEquals("Tank full", hybridCar.fuel());
    }

}
