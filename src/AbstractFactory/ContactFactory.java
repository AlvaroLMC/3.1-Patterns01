package AbstractFactory;

public interface ContactFactory {
    Address createAddress(String street, String city);
    PhoneNumber createPhoneNumber(String number);
}


