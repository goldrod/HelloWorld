package designmode.observer;

//观察者实现接口
public interface Observer<T>{
    void update(Observale<T> tObservale, T data);
}
