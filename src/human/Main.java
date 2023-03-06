package human;

public class Main {
    public static void main(String[] args) {
        Human alpha = new Human("Alpha");
        Human beta = new Human("Beta");
        alpha.addFriend(beta);
        beta.addFriend(alpha);

        System.out.println(alpha);
    }
}
