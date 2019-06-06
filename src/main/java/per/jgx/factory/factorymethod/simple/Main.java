package per.jgx.factory.factorymethod.simple;

/**
 * @author Jiang Guangxing
 */
public class Main {
    public static void main(String[] args) {
        SenderFactory senderFactory=new SenderFactory();
        senderFactory.getSender("sms").send();
        senderFactory.getSender("mail").send();
        senderFactory.getSender("other").send();
    }
}
