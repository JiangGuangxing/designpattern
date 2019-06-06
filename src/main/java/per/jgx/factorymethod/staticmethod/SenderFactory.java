package per.jgx.factorymethod.staticmethod;

import per.jgx.factorymethod.simple.MailSender;
import per.jgx.factorymethod.simple.Sender;
import per.jgx.factorymethod.simple.SmsSender;

/**
 * @author Jiang Guangxing
 */
public class SenderFactory {
    public static Sender getSmsSender() {
        return new SmsSender();
    }

    public static Sender getMailSender() {
        return new MailSender();
    }
}
