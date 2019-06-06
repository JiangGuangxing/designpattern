package per.jgx.builder.human;

/**
 * @author Jiang Guangxing
 */
public class Director {
    public Human createHumanByDirecotr(IBuildHuman bh) {
        bh.buildBody();
        bh.buildFoot();
        bh.buildHand();
        bh.buildHead();
        return bh.createHuman();
    }
}
