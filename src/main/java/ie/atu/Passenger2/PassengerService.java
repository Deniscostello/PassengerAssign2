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

    public void deletePassenger(Long count) {
        passengerRepo.deleteById(count);
    }

    public List<Passenger> findPassengerByAgeRange(int age1, int age2)
    {
        return passengerRepo.findPassengerByAge(age1, age2);
    }

    public List<Passenger> findPassengerByPhone(String phone1, String phone2)
    {
        return passengerRepo.findPassengerByPhone(phone1, phone2);
    }
}
