package AbstractFactory;

public class SpanishAddress implements Address {
    private String street, city;

    public SpanishAddress(String street, String city) {
        this.street = street;
        this.city = city;
    }

    public String getFullAddress() {
        return street + ", " + city + ", España";
    }
}
