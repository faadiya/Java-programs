class TicketBooking {

    int tickets = 5;

    synchronized void bookTicket(String name, int number) {

        if (tickets >= number) {

            System.out.println(name + " booked " + number + " ticket(s)");

            tickets = tickets - number;

            System.out.println("Remaining tickets: " + tickets);

        } else {

            System.out.println(name + " cannot book " + number
                    + " ticket(s). Not enough tickets.");

        }
    }
}

class Customer extends Thread {

    TicketBooking booking;
    int number;

    Customer(TicketBooking booking, int number, String name) {
        super(name);
        this.booking = booking;
        this.number = number;
    }

    public void run() {
        booking.bookTicket(getName(), number);
    }
}

class Multithreading_synchronization {

    public static void main(String[] args) {

        TicketBooking booking = new TicketBooking();

        Customer c1 = new Customer(booking, 2, "Customer 1");
        Customer c2 = new Customer(booking, 2, "Customer 2");
        Customer c3 = new Customer(booking, 2, "Customer 3");

        c1.start();
        c2.start();
        c3.start();
    }
}
