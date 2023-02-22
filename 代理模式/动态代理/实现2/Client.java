package 动态代理.实现2;

import 静态代理.实现.UserServiceImpl;

public class Client {
    public static void main(String[] args) {
        //获得真实角色
        UserServiceImpl userService = new UserServiceImpl();
        //获得代理角色，暂时没有
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        //处理程序处理接口对象
        pih.setTarget(userService);
        UserService proxy = (UserService) pih.getProxy();
        proxy.add();
    }
}
