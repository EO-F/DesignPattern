public class Singleton4 {

//TODO 内部类的单例模式

    /**
     * 静态内部类方式在Singleton类被装载时
     * <p>
     * 并不会立即实例化，而是在需要实例化时，调用getInstance方法，才会装载SingletonHolder类，从而完成Singleton的实例化
     */

    private Singleton4() {
    }

    private static class SingletonHolder {
        private static Singleton4 instance = new Singleton4();
    }

    public static Singleton4 getInstance() {
        return SingletonHolder.instance;
    }
}
