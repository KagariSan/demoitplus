package zoo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zoo {
    private List<Animal> animals;
    private String name;
    private String address;
    public Zoo(String name, String address) {
        this.name = name;
        this.address = address;
        this.animals = new ArrayList<>();
    }

    public Zoo(String name, String address, List<Animal> animals) {
        this.name = name;
        this.address = address;
        this.animals = animals;
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void removeAnimal(Animal animal) {
        animals.remove(animal);
    }

    @Override
    public String toString() {
        return this.name + ", Address: " + address + " Total animal: " + animals.size();
    }
}
