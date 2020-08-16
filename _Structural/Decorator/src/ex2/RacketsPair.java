package ex2;

public class RacketsPair extends BookingAddOnDecorator {

    public RacketsPair(TennisCourtBooking courtBooking) {
        setTennisCourtBooking(courtBooking);
    }

    @Override
    int cost() {
        return 50 + getTennisCourtBooking().cost();
    }
}
