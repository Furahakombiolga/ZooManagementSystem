public class Animal {

    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println("Animal sound");
    }

    public void eat() {
        System.out.println("Animal is eating");
    }

    public void makeSound(int times) {
        for (int i = 0; i < times; i++) {
            makeSound();
        }
    }

    public void eat(String foodType) {
        System.out.println(this.name + " is eating " + foodType);
    }
}

class Lion extends Animal {

    public Lion(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(this.name + " Roar!");
    }

    @Override
    public void eat() {
        System.out.println(this.name +" is Eating meat");
    }
}

class Elephant extends Animal {

    public Elephant(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(this.name + " Trumpet!");
    }

    @Override
    public void eat() {
        System.out.println(this.name + " is Eating grass");
    }
}

class Monkey extends Animal {

    public Monkey(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(this.name + " Chatter!");
    }

    @Override
    public void eat() {
        System.out.println(this.name + " is Eating bananas");
    }
}

