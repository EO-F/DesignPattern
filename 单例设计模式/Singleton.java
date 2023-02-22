public class Singleton {
    private static Singleton instance = new Singleton();

    //TODO 饿汉式的单例模式
    private Singleton(){}
    public static Singleton getInstance(){
        return instance;
    }
}
