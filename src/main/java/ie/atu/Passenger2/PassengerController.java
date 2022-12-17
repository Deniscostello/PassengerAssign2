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

    @GetMapping("/age")
    public List<Passenger> getPassengerByAge(@RequestParam(name = "age_start") int age1, @RequestParam(name= "age_end") int age2)
    {
        return myService.findPassengerByAgeRange(age1, age2);
    }

    @GetMapping("/phone")
    public  List<Passenger> getPassengerByPhone(@RequestParam(name = "phone_start") int phone1, @RequestParam(name= "phone_end") int phone2)
    {
        return myService.findPassengerByAgeRange(phone1, phone2);
    }

    @GetMapping("/{passengerID}")
    public Passenger getPassenger(@PathVariable String passengerID) {
        return myService.getPassenger(passengerID);
    }

}
