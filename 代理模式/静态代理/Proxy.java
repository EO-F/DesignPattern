package 静态代理;

//中介代理
public class Proxy implements Rent{
    //多用组合，少用继承
    private Host host;

    public Proxy() {
    }

    public Proxy(Host host) {
        this.host = host;
    }

    @Override
    public void rent() {
        host.rent();
        seeHost();
        charge();
    }
    //看房，这件事中介能实现，房东不能实现
    public void seeHost(){
        System.out.println("中介带你看房子");
    }
    //收中介费，这件事也只有中介能实现
    public void charge(){
        System.out.println("中介收你中介费");
    }
}

