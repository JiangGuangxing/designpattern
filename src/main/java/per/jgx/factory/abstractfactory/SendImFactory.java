package per.jgx.factory.abstractfactory;

import per.jgx.factory.factorymethod.simple.Sender;

/**
 * @author Jiang Guangxing
 */
public class SendImFactory implements Producer {
    public Sender produce() {
        return new ImSender();
    }
}
