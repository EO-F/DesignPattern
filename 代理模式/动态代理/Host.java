package 动态代理;

//房东，被代理的真实角色 实现租房Rent这个接口
public class Host implements Rent {
    public void rent() {
        System.out.println("房东要把房子租出去");
    }
}
