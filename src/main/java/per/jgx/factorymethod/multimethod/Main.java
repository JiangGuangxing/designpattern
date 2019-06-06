package per.jgx.factorymethod.multimethod;

/**
 * @author Jiang Guangxing
 */
public class Main {
    public static void main(String[] args) {
        SendFactory sendFactory = new SendFactory();
        sendFactory.getMailSender().send();
        sendFactory.getSmsSender().send();
    }
}
