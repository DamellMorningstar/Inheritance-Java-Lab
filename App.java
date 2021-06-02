public class App {
    public static void main(String[] args) throws Exception {
        Animal animal = new Animal("bird", 1, 1, 5, 5);

        Dog dog = new Dog("Kangal", 2, 56, 135, 2, 4, 1, 20);
        dog.eat();
        dog.walk();
        dog.run();
    }
}
