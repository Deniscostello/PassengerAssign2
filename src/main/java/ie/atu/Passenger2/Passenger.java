package ie.atu.Passenger2;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Passenger {
    //instance variables
    private String Title;
    private String Name;
    private String ID;
    private String Phone;
    private int Age;

    public Passenger(String title, String name, String id, String phone, int age) {
        setTitle(title);
        setName(name);
        setID(id);
        setPhone(phone);
        setAge(age);
    }

    //Name get and set method
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        if(name.length() >= 3){
            Name = name;
        }
        else{
            throw new IllegalArgumentException("Name must be a minimum of 3 characters");
        }
    }

    //Title get and set method
    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        if("Mr".equalsIgnoreCase(title) || "Mrs".equalsIgnoreCase(title) || "Ms".equalsIgnoreCase(title)){
            Title = title;
        }
       else{
           throw new IllegalArgumentException("Please enter 'Mr' , 'Mrs' or 'Ms' ");
        }
    }

    //ID get and set method
    public String getID() {
        return ID;
    }

    public void setID(String id) {
        int idSize = id.length();
        if(idSize > 9){
            ID = id;
        }
        else{
            throw new IllegalArgumentException("ID must be a minimum of 10 characters");
        }
    }

    //Phone get and set method
    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        int phoneSize = phone.length();
        if(phoneSize > 6) {
            Phone = phone;
        }
        else{
            throw new IllegalArgumentException("Phone number must be 7 characters minimum");
        }
    }

    //Age get and set method
    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        if(age > 16) {
            Age = age;
        }
        else{
            throw new IllegalArgumentException("Must be over 16 to fly");
        }
    }
}
