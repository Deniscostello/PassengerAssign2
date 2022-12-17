package ie.atu.Passenger2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PassengerSuccessTest {

    @BeforeEach
    void setUp() {
    }

    //Title Success Test
    @Test
    void testTitleSuccess(){
        Passenger pass1 = new Passenger("Mr", "Denis", "12345678910", "12345678", 20);
        assertEquals("Mr", pass1.getTitle());
    }

    //Name Success Test
    @Test
    void testNameSuccess(){
        Passenger pass2 = new Passenger("Mrs", "Kate", "9876543210", "87654321", 50);
        assertEquals("Kate", pass2.getName());
    }
    //ID Success Test
    @Test
    void testIDSuccess(){
        Passenger pass3 = new Passenger("Ms", "Sarah", "10987654321", "123454321", 28);
        assertEquals("10987654321", pass3.getID());
    }
    //Phone Success Test
    @Test
    void testPhoneSuccess(){
        Passenger pass1 = new Passenger("Mr", "Denis", "12345678910", "12345678", 20);
        assertEquals("12345678", pass1.getPhone());
    }
    //Age Success Test
    @Test
    void testAgeSuccess(){
        Passenger pass1 = new Passenger("Mr", "Denis", "12345678910", "12345678",20);
        assertEquals(20, pass1.getAge());
    }

    @AfterEach
    void tearDown() {
    }
}