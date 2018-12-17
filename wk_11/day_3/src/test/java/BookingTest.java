import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {
    private Bedroom bedroom;
    private Booking booking;

    @Before
    public void setUp() throws Exception {
        bedroom = new Bedroom(101,2,"single", 5);
        booking = new Booking(bedroom, 3);
    }

    @Test
    public void canGetTotalBill() {
        float result = booking.bookingCost();
        assertEquals(15, result, 0.01);
    }
}
