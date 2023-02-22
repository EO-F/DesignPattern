
public interface Subject {


    //注册一个观察者
    public void registerObserver(Observer observer);

    //移除一个观察者
    public void removeObserver(Observer observer);

    public void notifyObserver();

}
