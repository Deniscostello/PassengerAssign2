package ie.atu.Passenger2;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PassengerRepo extends JpaRepository<Passenger,Long> {
    @Query("SELECT p FROM Passenger p WHERE p.Age > ?1 and p.Age < ?2")
    public List<Passenger> findPassengerByAge(int age, int age2);

    //My own query
    @Query("SELECT p FROM Passenger p WHERE p.Phone > ?1 and p.Phone < ?2 ")
    public List<Passenger> findPassengerByPhone(String phone1, String phone2);

}
