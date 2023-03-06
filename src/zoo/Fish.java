package zoo;

public class Fish extends Animal implements AnimalCanSwim {
    public Fish(String loai, Integer age) {
        super(loai, age);
    }

    public void swim() {
        System.out.println("The " + super.loai + " is swimming");
    }
}
