public class Singleton3 {

    //TODO 懒汉式的单例模式

    private static volatile Singleton3 instance = null;

    private Singleton3(){

    }
    /**
    线程不安全，不可用
    public static Singleton3 getInstance(){
        if(instance == null){
            instance = new Singleton3();
        }
        return instance;
    }
     */

    /** 线程安全，但是效率低，不建议使用
    public static synchronized Singleton3 getInstance(){
        if(instance == null){
            instance = new Singleton3();
        }
        return instance;
    }
     */

    //单例模式懒汉式双重校验锁

    /*
     1、分配内存空间
     2、执行构造方法
     3、把这个对象指向这个空间
          123 正常顺序
          132 如果是这个顺序，在A线程执行了3还没有执行2
     B线程发现lazyMan不等于空，这时直接返回，这样这个实例是没有完全初始化的，不安全，因此要加入volatile防止指令重排
*/


    public static Singleton3 getInstance() {
        if (instance == null) {

            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton3();
                }
            }
        }
        return instance;
    }

}
