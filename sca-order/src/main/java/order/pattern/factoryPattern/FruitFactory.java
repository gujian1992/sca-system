package order.pattern.factoryPattern;

/**
 * @author: lyk
 * @date: 2022/2/13 14:44
 * @description:
 */
public class FruitFactory {
    public static Fruit getInstance(String className) {
        Fruit fruit = null;
        try {
            fruit = (Fruit) Class.forName(className).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return fruit;
    }

    /**
     * 简单工厂模式+反射，创建对象，这个也是ioc实现机制
     * @param args
     */
    public static void main(String[] args) {
        FruitFactory.getInstance(Apple.class.getName()).mean();
        FruitFactory.getInstance(Banana.class.getName()).mean();
    }
}
