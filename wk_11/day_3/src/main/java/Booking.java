public class Booking {
    private Bedroom bedroom;
    private int NoOfNights;

    public Booking(Bedroom bedroom, int noOfNights) {
        this.bedroom = bedroom;
        this.NoOfNights = noOfNights;
    }

    public float bookingCost(){
        float totalCost = this.NoOfNights*bedroom.getNightlyRate();
        return totalCost;
    }
}
