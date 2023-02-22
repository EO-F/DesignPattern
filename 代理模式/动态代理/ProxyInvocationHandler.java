package 动态代理;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//我们将会用这个类自动生成代理类，这个类(ProxyInvocationHandler)只是proxy代理实例的调用处理程序
public class ProxyInvocationHandler implements InvocationHandler {

    private Rent rent;

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    //生成代理类
    public Object getProxy(){
      //this.getClass().getClassLoader()代表加载类 rent.getClass().getInterfaces()代表要实现的接口 this代表当前InvocationHandler接口对象
      return Proxy.newProxyInstance(this.getClass().getClassLoader(),rent.getClass().getInterfaces(),this);
    }
    //处理代理实例，并返回结果
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        seeHose();
        fare();//这两个方法会通过反射动态的加载到代理类中04
        //动态代理的本质还是反射机制
        Object result = method.invoke(rent,args);
        return result;
    }
    public void seeHose(){
        System.out.println("中介带你看房子");
    }
    public void fare(){
        System.out.println("收中介费");
    }
}
