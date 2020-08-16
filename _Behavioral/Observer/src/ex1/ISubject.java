package ex1;

public interface ISubject {
    void register(Subscriber subscriber);
    void unregister(Subscriber subscriber);
    void notifySubscribers();
}
