package per.jgx.factory.factorymethod.staticmethod;

import per.jgx.factory.factorymethod.simple.MailSender;
import per.jgx.factory.factorymethod.simple.Sender;
import per.jgx.factory.factorymethod.simple.SmsSender;

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
