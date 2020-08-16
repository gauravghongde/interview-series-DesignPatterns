package ex2;

public class BallPack extends BookingAddOnDecorator {

    public BallPack(TennisCourtBooking courtBooking) {
        setTennisCourtBooking(courtBooking);
    }

    @Override
    int cost() {
        return 30 + getTennisCourtBooking().cost();
    }
}
