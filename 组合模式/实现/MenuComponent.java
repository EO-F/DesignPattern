package 实现;

/**
 * 抽象菜单组件
 */
public abstract class MenuComponent {

    public void add(MenuComponent menu) {
        throw new UnsupportedOperationException();
    }

    public void remove(MenuComponent menu) {
        throw new UnsupportedOperationException();
    }

    public MenuComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }

    public String getName() {
        throw new UnsupportedOperationException();
    }

    public double getPrice() {
        throw new UnsupportedOperationException();
    }

    public abstract void print();
}