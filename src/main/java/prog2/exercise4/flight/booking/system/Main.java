package prog2.exercise4.flight.booking.system;
import java.time.LocalDate;
/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args )
    {
        FlightBooking fly1 = new FlightBooking("Flandre",null , null,1,3);
        fly1.setBookingClass("1");
        fly1.setTripType("1");

        fly1.setTripSource("1");
        fly1.setTripDestination("2");
        fly1.Comparing();

        fly1.setSource_airport();
        fly1.setDestination_airport();

        fly1.settype();
        fly1.setclasses();
        fly1.setabroad();
        fly1.setTicketNumber();

        fly1.setDepartingTicketPrice(1,3);
        fly1.setReturnTicketPrice();
        fly1.setTotalTicketPrice();

        System.out.println(fly1);
    }
}
