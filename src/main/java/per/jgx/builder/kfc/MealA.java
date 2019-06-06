package per.jgx.builder.kfc;

/**
 * @author Jiang Guangxing
 */
public class MealA extends MealBuilder {
    public void buildDrink() {
        meal.setDrink("可乐");
    }

    public void buildFood() {
        meal.setFood("薯条");
    }
}

