package per.jgx.builder.human;

/**
 * @author Jiang Guangxing
 */
public interface IBuildHuman {
    void buildHead();

    void buildBody();

    void buildHand();

    void buildFoot();

    Human createHuman();
}
