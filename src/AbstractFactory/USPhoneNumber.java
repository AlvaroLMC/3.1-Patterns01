package AbstractFactory;

public class USPhoneNumber implements PhoneNumber {
    private String number;

    public USPhoneNumber(String number) {
        this.number = number;
    }

    public String getFullNumber() {
        return "+1 " + number;
    }
}