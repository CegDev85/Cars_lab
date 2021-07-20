import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ElectricCarTest {


    ElectricCar electricCar;

    @Before
    public void before(){
        electricCar = new ElectricCar("Honda","e",2020,9000,"KA19SDY","Aqua",3);
    }

    @Test
    public void hasRegistration(){
        assertEquals("KA19SDY", electricCar.getRegistration());
    }

    @Test
    public void canCharge(){
        assertEquals("Fully charged", electricCar.charge());
    }

    @Test
    public void canSwitchon(){
        assertEquals("Battery on", electricCar.switchOn());
    }

}
