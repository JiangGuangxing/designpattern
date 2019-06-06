package per.jgx.abstractfactory;

import per.jgx.factorymethod.simple.Sender;
import per.jgx.factorymethod.simple.SmsSender;

/**
 * @author Jiang Guangxing
 */
public class SendSmsFactory implements Producer {
    public Sender produce() {
        return new SmsSender();
    }
}
