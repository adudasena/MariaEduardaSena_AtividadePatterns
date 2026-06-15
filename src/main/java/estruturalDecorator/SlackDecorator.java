package estruturalDecorator;

public class SlackDecorator extends NotifierDecorator {

    public SlackDecorator(Notifier wrappee) {
        super(wrappee);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("Enviando SLACK: " + message);
    }
}