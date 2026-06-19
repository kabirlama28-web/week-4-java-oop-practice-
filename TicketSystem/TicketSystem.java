class Ticket {
    String ticketNumber;
    double price;

    Ticket(String ticketNumber, double price) {
        this.ticketNumber = ticketNumber;
        this.price = price;
    }

    void generateTicket() {
        System.out.println("Ticket: " + ticketNumber);
    }
}

class BusTicket extends Ticket {
    int seatNumber;

    BusTicket(String ticketNumber, double price, int seatNumber) {
        super(ticketNumber, price);
        this.seatNumber = seatNumber;
    }

    @Override
    void generateTicket() {
        System.out.println("Bus Seat: " + seatNumber);
    }
}

class TrainTicket extends Ticket {
    String coachType;

    TrainTicket(String ticketNumber, double price, String coachType) {
        super(ticketNumber, price);
        this.coachType = coachType;
    }

    @Override
    void generateTicket() {
        System.out.println("Coach Type: " + coachType);
    }
}

class FlightTicket extends Ticket {
    String boardingGate;

    FlightTicket(String ticketNumber, double price, String boardingGate) {
        super(ticketNumber, price);
        this.boardingGate = boardingGate;
    }

    @Override
    void generateTicket() {
        System.out.println("Boarding Gate: " + boardingGate);
    }
}

public class TicketSystem {
    public static void main(String[] args) {

        Ticket[] tickets = {
                new BusTicket("B001",1000,5),
                new TrainTicket("T001",2000,"AC"),
                new FlightTicket("F001",10000,"A1")
        };

        for(Ticket t : tickets) {
            t.generateTicket();
        }
    }
}