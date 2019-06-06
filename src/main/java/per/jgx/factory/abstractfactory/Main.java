package per.jgx.factory.abstractfactory;

/**
 * @author Jiang Guangxing
 */
public class Main {
    public static void main(String[] args) {
        Producer producer = new SendMailFactory();
        producer.produce().send();
        producer = new SendSmsFactory();
        producer.produce().send();
        producer = new SendImFactory();
        producer.produce().send();
    }
}
