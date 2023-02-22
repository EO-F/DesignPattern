package 静态工厂模式;

public class Test {
    public static void main(String[] args) {
        MoonCakesFactory.makeMoonCakes(FiveKernel.class).eat();
        MoonCakesFactory.makeMoonCakes(BeanSand.class).eat();
    }
}
