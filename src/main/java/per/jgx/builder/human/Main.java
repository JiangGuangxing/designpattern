package per.jgx.builder.human;

/**
 * @author Jiang Guangxing
 */
public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        System.out.println(director.createHumanByDirecotr(new SmartManBuilder()));
    }
}
