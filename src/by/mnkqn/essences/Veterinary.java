package by.mnkqn.essences;

public class Veterinary {

    private String name;

    public Veterinary(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void reviewDog(Dog dog) {
        System.out.println("Vet " + getName() + " reviews " + dog.getName());
        if (dog.isHealthy()) {
            System.out.println(dog.getName() + " is healthy\n");
        } else if (!dog.isHealthy()) {
            System.out.println(dog.getName() + " needs to be healed");
            healDog(dog);
        }
    }

    private void healDog(Dog dog) {
        System.out.println("Healing " + dog.getName());
        dog.setHealthy(true);
        System.out.println(dog.getName() + " is healthy now\n");
    }
}
