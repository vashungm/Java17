import business.Company;

public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private char middleInitial;
    private byte myByte;

    static private Company company = new Company();
    private Agency agency;


    // 13. Methods
    public void sayHello(){
        System.out.println("Hello World!!");
    }

    public static void main(String[] args) {

        Person p1 = new Person();
        p1.sayHello();
    }
    
}
