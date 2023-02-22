package 动态代理;

public class Client {
    public static void main(String[] args) {
        //真实角色
        Host host = new Host();
        //代理角色，暂时还没有
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        //通过处理程序来实现接口对象 这里用了多态，相当于 Rent rent = new Host();
        pih.setRent(host);
        //动态生成的代理类
        Rent proxy = (Rent) pih.getProxy();
        proxy.rent();
    }
}
