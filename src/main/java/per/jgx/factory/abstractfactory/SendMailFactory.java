package per.jgx.factory.abstractfactory;

import per.jgx.factory.factorymethod.simple.MailSender;
import per.jgx.factory.factorymethod.simple.Sender;

/**
 * @author Jiang Guangxing
 */
public class SendMailFactory implements Producer {
    public Sender produce() {
        return new MailSender();
    }
}
