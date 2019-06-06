package per.jgx.builder.kfc;

/**
 * @author Jiang Guangxing
 */
public class MealB extends MealBuilder {
    public void buildDrink() {
        meal.setDrink("柠檬果汁");
    }

    public void buildFood() {
        meal.setFood("鸡翅");
    }
}
