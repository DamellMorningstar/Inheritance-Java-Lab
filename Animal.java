public class Animal {
    private String name;
    private int age;
    private int body;
    private int size;
    private int weight;

    public Animal(String name, int age, int body, int size, int weight) {
        this.name = name;
        this.age = age;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }

    public void eat() {
        System.out.println("Animal.eat() called");
    }

    public void move(int speed) {
        System.out.println("Animal is moving at " + speed);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }

}
