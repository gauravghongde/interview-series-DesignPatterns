public class AnimalPlayground {

    public static void main(String[] args) {
        Dog timothy = new Dog();

        timothy.setName("Timothy");
        System.out.println(timothy.getName());
        timothy.run();
        changeName(timothy, "Tim"); // pass by reference (Objects are always passed by reference)
        System.out.println(timothy.getName()); // prints newName

        //////////

        Animal dawg = new Dog();
        System.out.println("Dawg sounds: " + dawg.getSound());

        //////////


    }

    public static void changeName(Dog timothy, String newName) {
        timothy.setName(newName);
    }
}
