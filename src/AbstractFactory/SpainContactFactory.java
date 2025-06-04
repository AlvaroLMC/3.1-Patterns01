package AbstractFactory;

public class SpainContactFactory implements ContactFactory {
    public Address createAddress(String street, String city) {
        return new SpanishAddress(street, city);
    }

    public PhoneNumber createPhoneNumber(String number) {
        return new SpanishPhoneNumber(number);
    }
}