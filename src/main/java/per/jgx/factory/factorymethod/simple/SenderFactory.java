package per.jgx.factory.factorymethod.simple;

/**
 * @author Jiang Guangxing
 */
public class SenderFactory {
    public Sender getSender(String senderType) {
        if ("mail".equals(senderType))
            return new MailSender();
        else if ("sms".equals(senderType))
            return new SmsSender();
        return null;
    }
}
