public class Main {
    public static void main(String[] args) {
        var travel1 = new TravelBookingAgency(new AirplaneBooking());
        var travel2 = new TravelBookingAgency(new TrainBook());
        travel1.bookTicket();
        travel2.bookTicket();

    }
}


interface TravelBooking {
    public void bookTicket();


}

class AirplaneBooking implements TravelBooking {

    @Override
    public void bookTicket() {
        System.out.println("Airplane fligth Ticket Booking");
    }
}

class TrainBook implements TravelBooking{

    @Override
    public void bookTicket() {
        System.out.println("Train Ticket Booking");
    }
}

class TravelBookingAgency implements TravelBooking {
    public TravelBooking ticket;

    public TravelBookingAgency(TravelBooking ticket) {
        this.ticket = ticket;
    }

    @Override
    public void bookTicket() {
        this.ticket = ticket;
    }
}