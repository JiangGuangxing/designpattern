package per.jgx.abstractfactory;

import per.jgx.factorymethod.simple.Sender;

/**
 * @author Jiang Guangxing
 */
public class SendImFactory implements Producer {
    public Sender produce() {
        return new ImSender();
    }
}
