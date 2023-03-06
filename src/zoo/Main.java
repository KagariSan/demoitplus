package zoo;

import zoo.child.Dragon;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo("Vuon thu Ha Noi", "Buoi Street");
        zoo.addAnimal(new Animal("Tiger", 10));
        zoo.addAnimal(new Animal("Bird", 3));

        System.out.println(zoo);

        Fish fish = new Fish("ca heo", 10);
        Bird bird = new Bird("dai bang", 15);
        fish.swim();
        bird.fly();
        anyCanFlyOnly(bird);
        anyCanSwimOnly(fish);
        Dragon dragon = new Dragon("Black Dragon", 10000);
        anyCanSwimOnly(dragon);
        anyCanFlyOnly(dragon);

        zoo.addAnimal(fish);
        zoo.addAnimal(bird);
    }

    static void anyCanSwimOnly(AnimalCanSwim animalCanSwim) {
        animalCanSwim.swim();
    }
     static void anyCanFlyOnly(AnimalCanFly animalCanFly) {
        animalCanFly.fly();
     }
}
