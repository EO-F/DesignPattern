package 静态代理;

//要租房的人
public class Client {
    public static void main(String[] args) {
        Host host = new Host();//获得房东
        //因为房东不能直接出租房子，所以我们要找中介（代理）,通过代理访问房东
        //代理一般会有一些附属操作，例如看房，收中介费
        Proxy proxy = new Proxy(host);
        proxy.rent();//本质还是调用了房东的rent方法


    }
}
