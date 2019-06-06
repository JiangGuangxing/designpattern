package per.jgx.builder.kfc;

/**
 * @author Jiang Guangxing
 */
public class Main {
    public static void main(String[] args) {
        //套餐A
        MealA a = new MealA();
        //准备套餐A的服务员
        KFCWaiter waiter = new KFCWaiter(a);
        //获得套餐
        Meal mealA = waiter.construct();
        System.out.print("套餐A的组成部分:");
        System.out.println("食物：" + mealA.getFood() + "；   " + "饮品：" + mealA.getDrink());

        waiter = new KFCWaiter(new MealB());
        //获得套餐
        Meal mealB = waiter.construct();
        System.out.print("套餐B的组成部分:");
        System.out.println("食物：" + mealB.getFood() + "；   " + "饮品：" + mealB.getDrink());

    }
}
