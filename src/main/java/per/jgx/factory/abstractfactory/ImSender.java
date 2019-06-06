package per.jgx.factory.abstractfactory;

import per.jgx.factory.factorymethod.simple.Sender;

/**
 * @author Jiang Guangxing
 */
public class ImSender implements Sender {
    public void send() {
        System.out.println("this is im sender!");
    }
}
