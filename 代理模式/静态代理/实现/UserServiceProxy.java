package 静态代理.实现;
//代理类
public class UserServiceProxy implements UserService{

    private UserServiceImpl userService;

    //使用set注入对象
    public void setUserService(UserServiceImpl userService){
        this.userService = userService;
    }

    @Override
    public void add() {
        log("add");
        userService.add();
    }

    @Override
    public void delete() {
        log("delete");
        userService.delete();
    }

    @Override
    public void update() {
        log("update");
        userService.update();
    }

    @Override
    public void query() {
        log("query");
        userService.query();
    }
    //日志的方法
    public void log(String msg){
        System.out.println("使用了"+msg+"方法");
    }
}
