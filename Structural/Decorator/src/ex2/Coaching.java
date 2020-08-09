package ex2;

public class Coaching extends BookingAddOnDecorator {

    public Coaching(TennisCourtBooking courtBooking) {
        setTennisCourtBooking(courtBooking);
    }

    @Override
    int cost() {
        return 100 + getTennisCourtBooking().cost();
    }
}
