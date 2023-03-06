package zoo.child;

import zoo.Animal;
import zoo.AnimalCanFly;
import zoo.AnimalCanSwim;

public class Dragon extends Animal implements AnimalCanFly, AnimalCanSwim {

    public Dragon(String loai, Integer age) {
        super(loai, age);
    }

    @Override
    public void fly() {
        System.out.println("The " + super.loai + " is flying");
    }

    @Override
    public void swim() {
        System.out.println("The " + super.loai + " is swimming");
    }
}
