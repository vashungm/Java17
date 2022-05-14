import java.time.LocalDate;
public class HelloWorld{
    public static void main (String args []){

        System.out.println("Hello World!");

        Person tom = new Person("Tom", "Smith", LocalDate.of(1996,05, 04));
        
        Person jane = new Person("Jane", "Smith", LocalDate.of(1998, 06, 25));

        Address address1 = new Address("Jayand", "CrossRoad", "Johansberg", "Italy", 56377);

        tom.setAddress(address1);
        tom.setSpouse(jane);

        System.out.println(tom);

    }
    
}