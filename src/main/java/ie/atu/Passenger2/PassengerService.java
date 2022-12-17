package ie.atu.Passenger2;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PassengerService {

    public List<Passenger> getPassengers()
    {
        List<Passenger> myPassengers = List.of(
                new Passenger("Mr", "Paul", "1234567891", "09871234", 23),
                new Passenger("Mr", "Paul2", "9876543217", "08712321", 93),
                new Passenger("Mr", "Paul3", "12345673353", "09212343", 53));
        return myPassengers;
    }

    public Passenger getPassenger(String passengerID) {
        Passenger myPassenger = new Passenger("Mr", "Paul", "1234567891", "09871234", 23);
        return myPassenger;
    }
}
