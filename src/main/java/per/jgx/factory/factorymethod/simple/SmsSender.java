package per.jgx.factory.factorymethod.simple;

/**
 * @author Jiang Guangxing
 */
public class SmsSender implements Sender {
    public void send() {
        System.out.println("this is sms sender!");
    }
}
