package ex1;

public class Subscriber implements IObserver {

    private String name;
    private Channel channel = new Channel();

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println(String.format("Hey %s, %s has Uploaded a new Video - '%s'",
                name, channel.getName(), channel.getVideo().getTitle()));
    }

    @Override
    public void subscribe(Channel channel) {
        this.channel = channel;
    }
}
