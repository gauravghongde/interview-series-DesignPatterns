package ex1.receiver;

// it actually performs the action
// this is the abstract receiver (receives the request or command)
public interface IElectronicDevice {

    void on();

    void off();

    void volumeUp();

    void volumeDown();
}
