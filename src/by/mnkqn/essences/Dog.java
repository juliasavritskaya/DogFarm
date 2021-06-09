package by.mnkqn.essences;

import java.util.Random;

public class Dog {

    private String name;
    private String state;
    private int age;
    private boolean healthy, hungry, trained;
    Volier volier;

    public Dog() {
        setState();
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
        setState();
    }

    public Dog(String name, int age, boolean healthy, boolean hungry, boolean trained) {
        this.name = name;
        this.age = age;
        this.healthy = healthy;
        this.hungry = hungry;
        this.trained = trained;
        setState();
    }

    //Присваивает собаке состояние: щенок, взрослая, пожилая.

    private void setState() {
        if (age < 2) {
            state = "Puppy";
        } else if (age > 2 && age < 8) {
            state = "Adult dog";
        } else if (age > 8) {
            state = "Old dog";
        }
    }

    public String getState() {
        return state;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void isTrained(boolean trained) {
        this.trained = trained;
    }

    public boolean getTrained() {
        return trained;
    }

    public void setVolier(Volier volier) {
        this.volier = volier;
    }

    public Volier getVolier() {
        return volier;
    }

    public void setHealthy(boolean healthy) {
        this.healthy = healthy;
    }

    public boolean isHealthy() {
        return this.healthy;
    }

    public boolean isHungry() {
        return hungry;
    }

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }

    public void eat() {
        switch (state) {
            case "Puppy" -> System.out.println(getName() + " is eating puppy's food.");
            case "Adult dog" -> System.out.println(getName() + " is eating adult's dog food.");
            case "Old dog" -> System.out.println(getName() + " is eating old's dog food.");
        }
        setHungry(false);
    }

    public void dailyActivities() {
        switch (getState()) {
            case "Puppy" -> trainPuppy();
            case "Adult dog" -> adultGoToToWork();
            case "Old dog" -> oldGoToVolier();
        }
        setHungry(true);
    }

    private void trainPuppy() {
        System.out.println("Puppy " + getName() + " is trained on a training ground.");
        isTrained(true);
    }

    private void adultGoToToWork() {
        Random random = new Random();
        int jobChoice = random.nextInt(3);
        switch (jobChoice){
            case 0 -> System.out.println(getName() + " goes to work at the police station.");
            case 1 -> System.out.println(getName() + " goes to work at the rescue service");
            case 2 -> System.out.println(getName() + " goes to work as a medical volunteer.");
            default -> throw new IllegalStateException("Unexpected value: " + jobChoice);
        }
}

    private void oldGoToVolier() {
        System.out.println(getName() + " stays at volier.");
    }


}