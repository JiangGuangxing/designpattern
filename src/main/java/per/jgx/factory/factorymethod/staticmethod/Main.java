package per.jgx.factory.factorymethod.staticmethod;


/**
 * @author Jiang Guangxing
 */
public class Main {
    public static void main(String[] args) {
        SenderFactory.getMailSender().send();
        SenderFactory.getSmsSender().send();
    }
}
