package ex1;

import java.util.ArrayList;
import java.util.List;

public class Channel implements ISubject {

    List<Subscriber> subscribers = new ArrayList<>();
    private String name;
    private Video video;

    public Channel() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Video getVideo() {
        return video;
    }

    @Override
    public void register(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void unregister(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {
        subscribers.forEach(Subscriber::update);
    }

    // trigger element
    public void upload(String title) {
        this.video = new Video();
        this.video.setTitle(title);
        notifySubscribers();
    }
}
