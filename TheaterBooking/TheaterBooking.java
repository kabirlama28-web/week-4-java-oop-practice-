class Seat {
    private int seatNumber;

    Seat(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    void bookSeat() {
        System.out.println("Seat booked");
    }

    public int getSeatNumber() {
        return seatNumber;
    }
}

class RegularSeat extends Seat {
    RegularSeat(int seatNumber) {
        super(seatNumber);
    }

    @Override
    void bookSeat() {
        System.out.println("Regular Seat " + getSeatNumber() + " booked");
    }
}

class PremiumSeat extends Seat {
    PremiumSeat(int seatNumber) {
        super(seatNumber);
    }

    @Override
    void bookSeat() {
        System.out.println("Premium Seat " + getSeatNumber()
                + " booked with snacks and luxury tax");
    }
}

public class TheaterBooking {
    public static void main(String[] args) {

        Seat s1 = new RegularSeat(10);
        Seat s2 = new PremiumSeat(20);

        s1.bookSeat();
        s2.bookSeat();
    }
}