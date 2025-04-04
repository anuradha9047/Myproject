
class Reservation {
    protected String reservationId;
    protected String customerName;
    protected String date;

    public Reservation(String reservationId, String customerName, String date) {
        this.reservationId = reservationId;
        this.customerName = customerName;
        this.date = date;
    }

    public void checkStatus() {
        System.out.println("Reservation ID: " + reservationId);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Date: " + date);
    }

    public void modifyReservation(String customerName, String date) {
        this.customerName = customerName;
        this.date = date;
        System.out.println("Reservation details updated successfully.");
    }
}

// Subclass: ResortReservation
class ResortReservation extends Reservation {
    private int roomNumber;

    public ResortReservation(String reservationId, String customerName, String date, int roomNumber) {
        super(reservationId, customerName, date);
        this.roomNumber = roomNumber;
    }

    @Override
    public void checkStatus() {
        super.checkStatus();
        System.out.println("Room Number: " + roomNumber);
    }

    public void modifyReservation(String customerName, String date, int roomNumber) {
        super.modifyReservation(customerName, date);
        this.roomNumber = roomNumber;
        System.out.println("Room number updated to: " + roomNumber);
    }
}

// Subclass: RailwayReservation
class RailwayReservation extends Reservation {
    private String seatNumber;

    public RailwayReservation(String reservationId, String customerName, String date, String seatNumber) {
        super(reservationId, customerName, date);
        this.seatNumber = seatNumber;
    }

    @Override
    public void checkStatus() {
        super.checkStatus();
        System.out.println("Seat Number: " + seatNumber);
    }

    public void modifyReservation(String customerName, String date, String seatNumber) {
        super.modifyReservation(customerName, date);
        this.seatNumber = seatNumber;
        System.out.println("Seat number updated to: " + seatNumber);
    }
}

// Main class to test the program
public class Main {
    public static void main(String[] args) {
        ResortReservation resort = new ResortReservation("R1010", "Riya", "2025-05-10", 101);
        RailwayReservation railway = new RailwayReservation("TR001", "Jack", "2025-05-11", "A1-23");

        System.out.println("== Resort Reservation ==");
        resort.checkStatus();
        resort.modifyReservation("Riya gupta", "2025-06-15", 202);
        resort.checkStatus();

        System.out.println("\n== Railway Reservation ==");
        railway.checkStatus();
        railway.modifyReservation("Jack smith", "2025-06-20", "B2-45");
        railway.checkStatus();
    }
}
