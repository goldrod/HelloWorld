/**
 * 观察者模式：定义对象间一对多的依赖关系，当对象发生改变时，
 * 所有依赖他的对象都能得到通知并被自动更新
 * 用例：android的广播机制和EventBus注册监听
 * 观察者 observer 或者订阅者 subscriber
 * 被观察者 observable 或者主题 subject
 *
 **/

//被观察者
public class Observale<T>{

    List<Observer> observers = new ArrayList<Observale>();

    public void register(Observer observer){
        if(observer == null) return;
        synchronized (this){
            if(!observers.contains(observer)){
                observers.add(observer);
            }
        }
    }

    public void unRegister(Observer observer){
        observers.remove(observer)
    }

    public void notifyObservers(T data){
        for(Observer observer :observers){
            observer.update(this,data);
        }
    }
}


//观察者实现接口
public interface Observer<T>{
    void update(Observale<T>,T data);
}