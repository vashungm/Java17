import java.time.LocalDate;

public class Person {

    private String firstName;
    private String lastName;
    private LocalDate dob;
    public Address address;
    Person spouse;


    //Constructor
    public Person(String fname, String ln, LocalDate dob){
        this.firstName = fname;
        this.lastName = ln;
        this.dob = dob;
    }

    // Getter and Setter

    public void setFirstName(String fname){
        firstName = fname;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Person getSpouse() {
        return spouse;
    }

    public void setSpouse(Person spouse) {
        this.spouse = spouse;
    }

    @Override
    public String toString() {
        return "\nPerson \nName : " + firstName + lastName + " "
                +"\nAddress: " + address + "\n"
                +"Dob: " + dob + "\n"+ 
                "Spouse: " + spouse;
    }
}
