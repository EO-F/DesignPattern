package 实现;

public class Client {
    public static void main(String[] args) {
        Menu menu = new Menu("所有菜单");

        Menu menu1 = new Menu("子菜单1");
        Menu menu2 = new Menu("子菜单2");
        Menu menu3 = new Menu("子菜单3");

        //给所有菜单添加三个子菜单
        menu.add(menu1);
        menu.add(menu2);
        menu.add(menu3);

        //给第二个菜单添加一个菜单项和一个子菜单
        menu2.add(new MenuItem("子菜单2--菜单项", 10.0));
        Menu menu4 = new Menu("子菜单2--子菜单");
        menu2.add(menu4);
        menu4.add(new MenuItem("子菜单2--子菜单--菜单项", 20.0));

        //打印所有菜单
        menu.print();
    }
}