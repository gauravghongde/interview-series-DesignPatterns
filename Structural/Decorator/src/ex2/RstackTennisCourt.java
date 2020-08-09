package ex2;

public class RstackTennisCourt {
    public static void main(String[] args) {
        TennisCourtBooking grassCourtBooking = new GrassCourtBooking(); // 500
        TennisCourtBooking grassCourtBookingWithCoaching = new Coaching(grassCourtBooking); // 600
        TennisCourtBooking grassCourtBookingWithCoachingAndRackets = new RacketsPair(grassCourtBookingWithCoaching); // 650

        System.out.println(String.format(("Grass Court Booking = %d\nWith Coaching (+100) = %d\nAnd RacketPair (+50) = %d"),
                grassCourtBooking.cost(),
                grassCourtBookingWithCoaching.cost(),
                grassCourtBookingWithCoachingAndRackets.cost()
        ));

        TennisCourtBooking grassCourtBookingWithCoachingAndExtraRackets = new RacketsPair(grassCourtBookingWithCoachingAndRackets); // 700
        System.out.println("Final Price with Extra Rackets (+50) = " + grassCourtBookingWithCoachingAndExtraRackets.cost());

        /* o/p

        Grass Court Booking = 500
        With Coaching (+100) = 600
        And RacketPair (+50) = 650
        Final Price with Extra Rackets (+50) = 700

         */
    }
}
