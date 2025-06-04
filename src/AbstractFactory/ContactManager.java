package AbstractFactory;


public class ContactManager {
    private ContactFactory factory;

    public ContactManager(ContactFactory factory) {
        this.factory = factory;
    }

    public void addContact(String street, String city, String phone) {
        Address address = factory.createAddress(street, city);
        PhoneNumber phoneNumber = factory.createPhoneNumber(phone);
        System.out.println("Contact Created:");
        System.out.println("Address: " + address.getFullAddress());
        System.out.println("Phone: " + phoneNumber.getFullNumber());
    }
}
