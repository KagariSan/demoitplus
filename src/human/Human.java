package human;

import java.util.ArrayList;
import java.util.List;

public class Human {
    private String name;
    private List<Human> friends;

    public Human(String name) {
        this.name = name;
        this.friends = new ArrayList<>();
    }

    public void addFriend(Human friend) {
        this.friends.add(friend);
    }

    @Override
    public String toString() {
        String str = "Name: " + this.name +
                "\n Friend: ";
        for (Human friend :
                friends) {
            str += "\n " + friend.toString();
        }
        return str;
    }
}
