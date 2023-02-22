package 动态代理.实现2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//我们将会用这个类自动生成代理类，这只是一个处理程序
public class ProxyInvocationHandler implements InvocationHandler {

    private Object target;

    public void setTarget(Object target) {
        this.target = target;
    }

    //生成代理类
    public Object getProxy(){
      //this.getClass().getClassLoader()代表加载类 rent.getClass().getInterfaces()代表要实现的接口 this代表当前InvocationHandler接口对象
      return Proxy.newProxyInstance(this.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }
    //处理代理实例，并返回结果
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //动态代理的本质还是反射机制
        log(method.getName());//用反射动态的获取方法名
        Object result = method.invoke(target,args);
        return result;
    }
    //增加日志功能
    public void log(String msg){
        System.out.println("[Debug]：使用了"+msg+"方法");
    }
}
