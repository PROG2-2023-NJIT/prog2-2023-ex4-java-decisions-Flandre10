package prog2.exercise4.flight.booking.system;
import java.time.LocalDate;
import java.util.Objects;


class FlightBooking {
    private final String flightCompany = " Flights-of-Fancy";
    private final String flightID = "19191810";
    private final String passengerFullName;


    public String getFlightID() {
        return flightID;
    }

    private int childPassengers ;
    private int adultPassengers;
    private int totalPassengers;




    public FlightBooking(String passengerFullName, LocalDate departureDate, LocalDate returnDate, int childPassengers, int adultPassengers) {
        this.childPassengers = childPassengers;
        this.adultPassengers = adultPassengers;
        this.passengerFullName = passengerFullName;
        this.departureDate = departureDate;
        this.returnDate = returnDate;
        setTotalPassengers(childPassengers,adultPassengers);
        setBookingClass("1");
        setTripType("1");
        setTripSource("1");
        setTripDestination("2","1");

        setSource_airport();
        setDestination_airport();
        settype();
        setclasses();
        setabroad();
        setTicketNumber();
        setDepartingTicketPrice(1,3);
        setReturnTicketPrice();
        setTotalTicketPrice();
    }


    String Bookingclass;                                                    //头等舱
    FlightBooking.BookingClass bookingclass;
    public void setBookingClass(String BookingClass){

        switch (BookingClass)
        {
            case "1":
                bookingclass = FlightBooking.BookingClass.FIRST;
                break;
            case "2":
                bookingclass = FlightBooking.BookingClass.BUSINESS;
                break;
            case "3":
                bookingclass = FlightBooking.BookingClass.ECONOMY;
                break;
            default:
                System.out.println("wrong");
        }
        Bookingclass = String.valueOf(bookingclass);
    }
    public String getBooking(){return Bookingclass;}
    String Tripype;                                                                    //往返
    public void setTripType(String tripType){

        switch (tripType)
        {
            case "1":
                this.Tripype = "One way";
                break;
            case "2":
                this.Tripype= "Return";
                break;
            default:
                System.out.println("wrong");
        }
    }
    public String gettripType(){
        return Tripype;
    }
//-------------------------------------------------------------------------------------

    LocalDate departureDate;
    LocalDate returnDate;
    public void setDepartureDate(LocalDate departureDate) {
    }

    public void setReturnDate(LocalDate returnDate) {                                       //   poikhftfcfccfctt
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }
    //==============================================================================================
    public enum TripType{
        ONE_WAY, RETURN
    }
    public enum BookingClass{
        FIRST,BUSINESS,ECONOMY
    }
    public enum TripSource{
        NANJING, BEIJING, SHANGHAI,  OULU, HELSINKI,PARIS
    }
    public enum TripDestination{
        NANJING, BEIJING, SHANGHAI,  OULU, HELSINKI,PARIS
    }
    public enum SourceAirport{
        NANJING_LUKOU_INTERNATIONAL_AIRPORT, BEIJING_CAPITAL_INTERNATIONAL_AIRPORT, SHANGHAI_PUDONG_INTERNATIONAL_AIRPORT, OULU_AIRPORT, HELSINKI_AIRPORT, PARIS_CHARLES_DE_GAULLE_AIRPORT
    }
    public enum DestinationAirport{
        NANJING_LUKOU_INTERNATIONAL_AIRPORT, BEIJING_CAPITAL_INTERNATIONAL_AIRPORT, SHANGHAI_PUDONG_INTERNATIONAL_AIRPORT, OULU_AIRPORT, HELSINKI_AIRPORT, PARIS_CHARLES_DE_GAULLE_AIRPORT
    }
    String Tripsource;                                                                  //出发
    FlightBooking.TripSource source;
    public void setTripSource(String tripsource){

        switch(tripsource){
            case "1":
                source = TripSource.NANJING;
                break;
            case "2":
                source = TripSource.BEIJING;
                break;
            case "3":
                source = TripSource.OULU;
                break;
            case "4":
                source = TripSource.HELSINKI;
                break;
            default:
                System.out.println("wrong");
        }
        Tripsource = String.valueOf(source);
    }
    public String getTripSource() {return Tripsource;
    }

    String TripSource_Airport;                                                             //出发场
    FlightBooking.SourceAirport source_airport;
    public void setSource_airport(){
        if(Tripsource == "NANJING"){
            source_airport = SourceAirport.NANJING_LUKOU_INTERNATIONAL_AIRPORT;
        }
        if(Tripsource == "BEIJIN"){
            source_airport = SourceAirport.BEIJING_CAPITAL_INTERNATIONAL_AIRPORT;
        }
        if(Tripsource== " Oulu"){
            source_airport = SourceAirport.OULU_AIRPORT;
        }
        if(Tripsource == "HELSINKI"){
            source_airport = SourceAirport.HELSINKI_AIRPORT;
        }
        TripSource_Airport = String.valueOf(source_airport);
    }
    public String getSource_airport() {return TripSource_Airport;
    }



    String Tripdestination;
    FlightBooking.TripDestination destination;                                 //目的

    public void setTripDestination(String tripdestination,String tripsource){
        switch(tripdestination){
            case "1":
                destination = TripDestination.NANJING;
                if(tripsource == "1"){destination = null;}
                break;
            case "2":
                destination = TripDestination.BEIJING;
                if(tripsource == "2"){destination = null;}
                break;
            case "3":
                destination = TripDestination.OULU;
                if(tripsource == "3"){destination = null;}
                break;
            case "4":
                destination = TripDestination.HELSINKI;
                if(tripsource == "4"){destination = null;}
                break;
            default:
                System.out.println("wrong");
        }
        Tripdestination = String.valueOf(destination);
    }
    public String getTripDestination() {return Tripdestination;
    }
    String TripDestination_Airport;                                         //目的场
    FlightBooking.DestinationAirport destination_airport;
    public void setDestination_airport(){
        if(Tripdestination == "NANJING"){
            destination_airport = DestinationAirport.NANJING_LUKOU_INTERNATIONAL_AIRPORT;
        }
        if(Tripdestination == "BEIJING"){
            destination_airport = DestinationAirport.BEIJING_CAPITAL_INTERNATIONAL_AIRPORT;
        }
        if(Tripdestination == "OULU"){
            destination_airport = DestinationAirport.OULU_AIRPORT;
        }
        if(Tripdestination == "HELSINKI"){
            destination_airport = DestinationAirport.HELSINKI_AIRPORT;
        }
        TripDestination_Airport = String.valueOf(destination_airport);

    }
    public String getDestination_airport() {return TripDestination_Airport;
    }


    String type;
    String classes;
    String abroad;
    public void settype() {
        if(Tripype == "One way"){
            type = "11";
        }
        if(Tripype == "Return"){
            type = "22";
        }
    }
    public void setclasses() {
        if(Bookingclass == "FIRST"){
            classes = "F";
        }
        if(Bookingclass == "BUSINESS"){
            classes = "B";
        }
        if(Bookingclass == "ECONOMY"){
            classes = "E";
        }
    }
    public void setabroad() {
        if(Tripsource == "OULU" && Tripdestination == "HELSINKI"){
            abroad = "DOM";
        }
        if(Tripsource == "HELSINKI" && Tripdestination == "OULU"){
            abroad = "DOM";
        }
        if(Tripsource == "NANJING" && Tripdestination == "BEIJING"){
            abroad = "DOM";
        }
        if(Tripsource == "BEIJING" && Tripdestination == "NANJING"){                            // //查国际成分
            abroad = "DOM";
        }
        if(Tripsource == "NANJING" && Tripdestination == "OULU"){
            abroad = " INT";
        }
        if(Tripsource == "NANJING" && Tripdestination == "HELSINKI"){
            abroad = " INT";
        }
        if(Tripsource == "BEIJING" && Tripdestination == "OULU"){
            abroad = " INT";
        }
        if(Tripsource == "BEIJING" && Tripdestination == "HELSINKI"){
            abroad = " INT";
        }
        if (Tripsource == "OULU" && Tripdestination == "NANJING"){
            abroad = " INT";
        }
        if (Tripsource == "OULU" && Tripdestination == "BEIJING"){
            abroad = " INT";
        }
        if (Tripsource == "HELSINKI" && Tripdestination == "NANJING"){
            abroad = " INT";
        }
        if (Tripsource== "HELSINKI" && Tripdestination == "BEIJING"){
            abroad = " INT";
        }

    }

    String TicketNumber;
    public void setTicketNumber(){
        TicketNumber = type + classes + "1919" +abroad;                              //合成大怨种
    }
    public String getTicketNumber() {
        return TicketNumber;
    }

    public String getPassengerFullName() {return passengerFullName;
    }




    public int getChildrenPassengers() {return childPassengers;
    }

    public int getAdultPassengers() {return adultPassengers;
    }

    public String getFlightCompany() {return flightCompany;
    }

    public void setTotalPassengers(int childPassengers, int adultPassengers) {
        this.childPassengers = childPassengers;
        this.adultPassengers = adultPassengers;
        this.totalPassengers =adultPassengers+childPassengers;
    }

    public int getTotalPassengers() {
        return totalPassengers;
    }

    double TotalTicketPrice;
    double DepartingTicketPrice;
    double ReturnTicketPrice;
    public void setDepartingTicketPrice(int child,int adult) {
        if(type == "11"){
            if(Bookingclass == "FIRST")
                DepartingTicketPrice = (child + adult)*(300 + 300*0.1 + 300*0.05 + 250);
            if(Bookingclass == "BUSINESS")
                DepartingTicketPrice= (child + adult)*(300 + 300*0.1 + 300*0.05 + 150);
            if(Bookingclass == "ECONOMY")
                DepartingTicketPrice = (child + adult)*(300 + 300*0.1 + 300*0.05 + 50);}
        if(type == "22"){
            if(Bookingclass == "FIRST")
                DepartingTicketPrice = (child + adult)*(300 + 300*0.15 + 300*0.1 + 250);
            if(Bookingclass == "BUSINESS")
                DepartingTicketPrice = (child + adult)*(300 + 300*0.15 + 300*0.1 + 150);
            if(Bookingclass == "ECONOMY")
                DepartingTicketPrice = (child + adult)*(300 + 300*0.15 + 300*0.1 + 50);}
    }
    public void setReturnTicketPrice() {
        ReturnTicketPrice = this.DepartingTicketPrice;
    }
    public void  setTotalTicketPrice(){
        TotalTicketPrice = this.DepartingTicketPrice + this.ReturnTicketPrice;
    }
    public double getTotalTicketPrice() {
        return TotalTicketPrice;
    }
    public String toString(){
        return  "Thank you for booking your flight with " + flightCompany+
                ". Following are the details of your booking and the trip:" + "\n" +
                "Ticket Number: " + TicketNumber + "\n" +
                "From " + Tripsource+ " to " + Tripdestination+ "\n" +
                "Date of departure: " + departureDate+ "\n" +
                "Date of return: " + returnDate + "\n" +
                "Total passengers: " + totalPassengers + "\n" +
                "Total ticket price in Euros: " + TotalTicketPrice+"\n"+
                "IMPORTANT NOTICE: As per our policy, the return date was changed because it was \n" +
                "less than two days apart from your departure date.";
    }
}



