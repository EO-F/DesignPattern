public class Singleton2 {

    //TODO 饿汉式的变换写法
    private static Singleton2 instance = null;

    static {
        instance = new Singleton2();
    }

    private Singleton2(){}

    public static Singleton2 getInstance(){
        return instance;
    }
}
