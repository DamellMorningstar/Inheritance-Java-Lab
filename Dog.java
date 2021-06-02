public class Dog extends Animal {
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;

    public Dog(String name, int age, int size, int weight, int eyes, int legs, int tail, int teeth) {
        super(name, age, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;

    }

    // new method for a dog to eat.

    private void chew() {
        System.out.println("Dog.chew() called");
    }

    // how to overide a method that exists in the super class

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }

    // overide move methods in super class

    public void walk() {
        System.out.println("Dog.walk() called");
        move(5);
    }

    public void run() {
        System.out.println("Dog.run() called");
        move(10);
    }

}
