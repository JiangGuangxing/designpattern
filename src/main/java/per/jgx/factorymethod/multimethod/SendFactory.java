package per.jgx.factorymethod.multimethod;

import per.jgx.factorymethod.simple.MailSender;
import per.jgx.factorymethod.simple.Sender;
import per.jgx.factorymethod.simple.SmsSender;

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
