package per.jgx.abstractfactory;

import per.jgx.factorymethod.simple.MailSender;
import per.jgx.factorymethod.simple.Sender;

/**
 * @author Jiang Guangxing
 */
public class SendMailFactory implements Producer {
    public Sender produce() {
        return new MailSender();
    }
}
