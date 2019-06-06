package per.jgx.abstractfactory;

import per.jgx.factorymethod.simple.Sender;

/**
 * @author Jiang Guangxing
 */
public class ImSender implements Sender {
    public void send() {
        System.out.println("this is im sender!");
    }
}
