package per.jgx.builder;

import per.jgx.factory.factorymethod.simple.MailSender;
import per.jgx.factory.factorymethod.simple.Sender;
import per.jgx.factory.factorymethod.simple.SmsSender;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jiang Guangxing
 */
public class Builder {
    private List<Sender> list = new ArrayList<>();

    public void produceMailSender(int count){
        for(int i=0; i<count; i++){
            list.add(new MailSender());
        }
    }

    public void produceSmsSender(int count) {
        for (int i = 0; i < count; i++) {
            list.add(new SmsSender());
        }
    }

}
