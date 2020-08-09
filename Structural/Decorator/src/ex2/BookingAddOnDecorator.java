package ex2;

public abstract class BookingAddOnDecorator extends TennisCourtBooking {

    TennisCourtBooking tennisCourtBooking;

    @Override
    public String getInfo() {
        return super.getInfo();
    }

    public TennisCourtBooking getTennisCourtBooking() {
        return tennisCourtBooking;
    }

    public void setTennisCourtBooking(TennisCourtBooking tennisCourtBooking) {
        this.tennisCourtBooking = tennisCourtBooking;
    }
}
