package AbstractFactory;

public class USAddress implements Address {
    private String street, city;

    public USAddress(String street, String city) {
        this.street = street;
        this.city = city;
    }

    public String getFullAddress() {
        return street + ", " + city + ", USA";
    }
}
