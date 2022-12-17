package ie.atu.Passenger2;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class PassengerService {
    private final PassengerRepo passengerRepo;

    public List<Passenger> getPassengers()
    {
        return passengerRepo.findAll();

    }

    public void savePassenger(Passenger passenger){
        passengerRepo.save(passenger);
    }

    public Passenger getPassenger(String passengerID) {
        Passenger myPassenger = new Passenger("Mr", "Paul", "1234567891", "09871234", 23);
        return myPassenger;
    }
}
