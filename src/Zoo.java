public class Zoo {

    public static void main(String[] args) {

        Lion lion = new Lion("Lion1", 5);
        Elephant elephant = new Elephant("Elephant1", 10);
        Monkey monkey = new Monkey("Monkey1", 2);

        Animal animal1 = lion;
        Animal animal2 = elephant;
        Animal animal3 = monkey;

        animal1.makeSound();
        animal2.makeSound();
        animal3.makeSound();

        elephant.eat("green leaves");
        monkey.eat("apples");
        lion.eat();
        elephant.eat();
        monkey.eat("apples");
    }
}
