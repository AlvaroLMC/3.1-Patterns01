package AbstractFactory;

public class USContactFactory implements ContactFactory {
    public Address createAddress(String street, String city) {
        return new USAddress(street, city);
    }

    public PhoneNumber createPhoneNumber(String number) {
        return new USPhoneNumber(number);
    }
}