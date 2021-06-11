package by.mnkqn.main;

import by.mnkqn.essences.*;
import by.mnkqn.helpers.CreateCollections;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DayModeling {
    public static void main(String[] args) {

        Random random = new Random();

        List<Volier> voliers = new ArrayList<>();
        CreateCollections.fillVolierCollection(voliers);

        List<Dog> dogs = new ArrayList<>();
        CreateCollections.fillDogCollection(dogs, voliers);

        List<Veterinary> vets = new ArrayList<>();
        CreateCollections.fillVeterinaryCollection(vets);

        List<TrainingGround> trainingGrounds = new ArrayList<>();
        CreateCollections.fillTrainingGroundCollection(trainingGrounds);

        List<Staff> staffs = new ArrayList<>();
        CreateCollections.fillStaffCollection(staffs);

        List<Jobs> jobs = new ArrayList<>();
        CreateCollections.fillJobsCollection(jobs);

        for (Dog doge : dogs) {
            doge.eat();
        }

        System.out.println();

        for (Dog doge : dogs) {
            int vetRandom = vets.size();
            vets.get(random.nextInt(vetRandom)).reviewDog(doge);
        }

        for (Volier volier : voliers) {
            int staffRandom = staffs.size();
            staffs.get(random.nextInt(staffRandom)).cleanVolier(volier);
        }

        System.out.println();

        for (Dog doge : dogs) {
            int trainingGroundsRandom = trainingGrounds.size();
            int jobsRandom = jobs.size();
            doge.dailyActivities(trainingGrounds.get(random.nextInt(trainingGroundsRandom)), jobs.get(random.nextInt(jobsRandom)));
        }

        System.out.println();

        for (Dog doge : dogs) {
            doge.eat();
        }
    }

}