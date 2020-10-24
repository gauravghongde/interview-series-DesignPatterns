package ex1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdapterDemo {

    @Test
    public void whenConvertingMPHToKMPH_thenSuccessfullyConverted() {
        Movable bugattiVeyron = new BugattiVeyron();
        IMovableAdapter bugattiVeyronAdapter = new MovableAdapter(bugattiVeyron);

        assertEquals(bugattiVeyron.getSpeed(), 268.0, 0.1);
        assertEquals(bugattiVeyronAdapter.getSpeed(), 431.30312, 0.00001);
    }
}
