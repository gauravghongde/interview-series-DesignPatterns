package ex1;

public class Youtube {
    public static void main(String[] args) {
        Channel infimode = new Channel();
        infimode.setName("infimode");

        Subscriber s1 = new Subscriber("s1");
        Subscriber s2 = new Subscriber("s2");
        Subscriber s3 = new Subscriber("s3");
        Subscriber s4 = new Subscriber("s4");

        s1.subscribe(infimode);
        infimode.register(s1);

        s2.subscribe(infimode);
        infimode.register(s2);

        s3.subscribe(infimode);
        infimode.register(s3);

        s4.subscribe(infimode);
        infimode.register(s4);

        infimode.unregister(s3);

        infimode.upload("This is my first video!!");

        /* o/p:

        Hey s1, infimode has Uploaded a new Video - 'This is my first video!!'
        Hey s2, infimode has Uploaded a new Video - 'This is my first video!!'
        Hey s4, infimode has Uploaded a new Video - 'This is my first video!!'
        */

    }
}
