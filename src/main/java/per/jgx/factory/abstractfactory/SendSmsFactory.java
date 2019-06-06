package per.jgx.factory.abstractfactory;

import per.jgx.factory.factorymethod.simple.Sender;
import per.jgx.factory.factorymethod.simple.SmsSender;

/**
 * @author Jiang Guangxing
 */
public class SendSmsFactory implements Producer {
    public Sender produce() {
        return new SmsSender();
    }
}
