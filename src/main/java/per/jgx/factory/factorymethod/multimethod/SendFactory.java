package per.jgx.factory.factorymethod.multimethod;

import per.jgx.factory.factorymethod.simple.MailSender;
import per.jgx.factory.factorymethod.simple.Sender;
import per.jgx.factory.factorymethod.simple.SmsSender;

/**
 * @author Jiang Guangxing
 */
public class SendFactory {
    public Sender getSmsSender() {
        return new SmsSender();
    }

    public Sender getMailSender() {
        return new MailSender();
    }
}
