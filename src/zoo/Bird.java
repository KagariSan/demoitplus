package zoo;

public class Bird extends Animal implements AnimalCanFly {
    static int count;
    static {
        count = 1;
    }
    public Bird(String loai, Integer age) {
        super(loai, age);
    }

    public void fly() {
        {
            System.out.println("test");
        }
        System.out.println("The " + super.loai + " is flying");
    }
}
