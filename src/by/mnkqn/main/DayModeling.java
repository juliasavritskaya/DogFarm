package by.mnkqn.main;

import by.mnkqn.essences.*;
import by.mnkqn.helpers.CreateCollections;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DayModeling {
    public static void main(String[] args) {

        Random random = new Random();

        List<Dog> dogs = new ArrayList<>();
        CreateCollections.fillDogCollection(dogs);

        List<Veterinary> vets = new ArrayList<>();
        CreateCollections.fillVeterinaryCollection(vets);

        List<TrainingGround> trainingGrounds = new ArrayList<>();
        CreateCollections.fillTrainingGroundCollection(trainingGrounds);

        List<Staff> staffs = new ArrayList<>();
        CreateCollections.fillStaffCollection(staffs);

        List<Volier> voliers = new ArrayList<>();
        CreateCollections.fillVolierCollection(voliers);

        for (Dog doge : dogs) {
            doge.eat();
        }

        System.out.println();

        for (Dog doge : dogs) {
            vets.get(random.nextInt(2)).reviewDog(doge);
        }

        for (Volier volier : voliers) {
            staffs.get(random.nextInt(2)).cleanVolier(volier);
        }

        System.out.println();

        for (Dog doge : dogs) {
            doge.dailyActivities();
        }

        for (Dog doge : dogs) {
            doge.eat();
        }


    }

}
