package by.mnkqn.essences;

import java.util.Random;

public class Dog {

    private String name;
    private String state;
    private String puppy = "Puppy";
    private String adultDog = "Adult Dog";
    private String oldDog = "Old dog";
    private int age;
    private final int puppyMaxAge = 2;
    private final int adultDogMaxAge = 8;
    private boolean healthy;
    private boolean hungry;
    private boolean trained;
    private Volier volier;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
        setState();
    }

    //Sets state for Dog objects according to their age: puppies, adults, old dogs.
    private void setState() {
        if (age > 0 && age <= puppyMaxAge) {
            state = puppy;
        } else if (age > puppyMaxAge && age < adultDogMaxAge) {
            state = adultDog;
        } else if (age >= adultDogMaxAge) {
            state = oldDog;
        }
    }

    public String getState() {
        return state;
    }

    public String getName() {
        return this.name;
    }

    public void isTrained(boolean trained) {
        this.trained = trained;
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

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }

    public void eat() {
        if (getState() == puppy) {
            System.out.println(getName() + " is eating puppy's food.");
        } else if (getState() == adultDog) {
            System.out.println(getName() + " is eating adult's dog food.");
        } else if (getState() == oldDog) {
            System.out.println(getName() + " is eating old's dog food.");
        }
        setHungry(false);
    }

    public void dailyActivities (TrainingGround trainingGround, Jobs jobs) {
        if (getState() == puppy) {
            trainPuppy(trainingGround);
        } else if (getState() == adultDog) {
            adultGoToToWork(jobs);
        } else if (getState() == oldDog) {
            oldGoToVolier();
        }
        setHungry(true);
    }

    private void trainPuppy(TrainingGround trainingGround) {
        System.out.println("Puppy " + getName() + " is trained on a " + trainingGround.getName());
        isTrained(true);
    }

    private void adultGoToToWork(Jobs job) {
        System.out.println(getName() + " goes to work to " + job.getName());
    }

    private void oldGoToVolier() {
        System.out.println(getName() + " stays at volier " + getVolier());
    }

}