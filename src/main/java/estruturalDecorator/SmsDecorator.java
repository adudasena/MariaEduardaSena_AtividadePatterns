package estruturalDecorator;

public class SmsDecorator extends NotifierDecorator {

    public SmsDecorator(Notifier wrappee) {
        super(wrappee);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("Enviando SMS: " + message);
    }
}