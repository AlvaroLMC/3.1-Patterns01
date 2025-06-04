package AbstractFactory;

public class SpanishPhoneNumber implements PhoneNumber {
    private String number;

    public SpanishPhoneNumber(String number) {
        this.number = number;
    }

    public String getFullNumber() {
        return "+34 " + number;
    }
}
