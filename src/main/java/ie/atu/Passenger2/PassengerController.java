package ie.atu.Passenger2;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/passenger")
public class PassengerController {

    PassengerService myService;

    public PassengerController(PassengerService myService) {
        this.myService = myService;
    }


    @GetMapping
    public List<Passenger> getPassengers()
    {
        return myService.getPassengers();
    }

    @PostMapping("")
    public void savePassenger(@RequestBody Passenger passenger){
        myService.savePassenger(passenger);
    }

    @DeleteMapping("delete/{count}")
    public void deletePassenger(@PathVariable("count") Long count)
    {
        myService.deletePassenger(count);
    }



    @GetMapping("/{passengerID}")
    public Passenger getPassenger(@PathVariable String passengerID) {
        return myService.getPassenger(passengerID);
    }

}
