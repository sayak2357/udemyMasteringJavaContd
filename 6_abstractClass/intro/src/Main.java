public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Blackie");
        dog.eat();
        dog.breathe();

        Chicken chicken = new Chicken("Chicken");
        chicken.eat();
        chicken.breathe();
        chicken.fly();

        Penguin penguin = new Penguin("King");
        penguin.fly();
    }
}
