import java.util.ArrayList;
import java.util.List;

public class DayModeling {
    public static void main(String[] args) {

        List<Dog> dogs = new ArrayList<>();

        dogs.add(new Dog("Stephen", 5));

        dogs.add(new Dog("Lolly", 1));

        dogs.add(new Dog("Artek", 12));

        dogs.add(new Dog("Fluffy", 45));

        for (Dog doge : dogs) {
            doge.eat();
        }

    }
}
