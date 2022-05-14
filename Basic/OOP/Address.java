public class Address {

    public String address1;
    public String address2;
    public String city;
    public String state;
    public int pincode;

    public Address(String ad1, String ad2, String city, String state, int pincode){
        this.address1 = ad1;
        this.address2 = ad2;
        this.city =city;
        this.pincode = pincode;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return "\n"+address1 + "\n " + address2 + "\n city: " + city + "\n pincode:" + pincode
                + "\n state: " + state + "";
    }
    

    
}
