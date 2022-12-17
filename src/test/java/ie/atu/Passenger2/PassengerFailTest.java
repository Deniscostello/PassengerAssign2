package ie.atu.Passenger2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PassengerFailTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testTitleFailure(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, ()-> new Passenger("M", "Denis", "12345678910", "12345678", 20));
        assertEquals("Please enter 'Mr' , 'Mrs' or 'Ms' ", exMessage.getMessage());
    }

    //Added name failure test
    @Test
    void testNameFailure(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, ()-> new Passenger("Mrs", "Ka", "9876543210", "87654321", 50));
        assertEquals("Name must be a minimum of 3 characters", exMessage.getMessage());
    }

    @Test
    void testIDFailure(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, ()-> new Passenger("Ms", "Sarah", "12345", "123454321", 28));
        assertEquals("ID must be a minimum of 10 characters", exMessage.getMessage());
    }

    @Test
    void testPhoneFailure(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, ()->new Passenger("Mr", "Denis","12345678910", "1234", 20));
        assertEquals("Phone number must be 7 characters minimum", exMessage.getMessage());
    }

    @Test
    void testAgeFailure(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, ()-> new Passenger("Mr", "Denis", "12345678910", "12345678", 2));
        assertEquals("Must be over 16 to fly", exMessage.getMessage());
    }

    @AfterEach
    void tearDown() {
    }
}