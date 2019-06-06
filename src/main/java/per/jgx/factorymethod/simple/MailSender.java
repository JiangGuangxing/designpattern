package per.jgx.factorymethod.simple;

/**
 * @author Jiang Guangxing
 */
public class MailSender implements Sender {
    public void send() {
        System.out.println("this is mail sender!");
    }
}
