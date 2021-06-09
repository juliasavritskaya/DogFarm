package by.mnkqn.helpers;

import by.mnkqn.essences.*;
import java.util.List;

public class CreateCollections {
    public static void fillDogCollection(List<Dog> doges, List<Volier> voliers) {

        Dog stephen = new Dog("Stephen", 5);
        stephen.setVolier(voliers.get(0));
        stephen.setHealthy(true);

        Dog lolly = new Dog("Lolly", 1);
        lolly.setVolier(voliers.get(2));
        lolly.setHealthy(false);

        Dog artek = new Dog("Artek", 9);
        artek.setVolier(voliers.get(1));
        artek.setHealthy(true);

        Dog fluffy = new Dog("Fluffy", 1);
        fluffy.setVolier(voliers.get(2));
        fluffy.setHealthy(false);

        Dog conny = new Dog("Conny", 7);
        conny.setVolier(voliers.get(1));
        conny.setHealthy(true);

        Dog sasha = new Dog("Sasha", 8);
        sasha.setVolier(voliers.get(0));
        sasha.setHealthy(false);

        doges.add(stephen);
        doges.add(lolly);
        doges.add(artek);
        doges.add(fluffy);
        doges.add(conny);
        doges.add(sasha);

    }

    public static void fillVeterinaryCollection(List<Veterinary> vets) {
        vets.add(new Veterinary("Vet Andrew"));
        vets.add(new Veterinary("Vet Helena"));
        vets.add(new Veterinary("Vet Marie"));
    }

    public static void fillVolierCollection(List<Volier> voliers) {
        voliers.add(new Volier("Volier 1", true));
        voliers.add(new Volier("Volier 2", false));
        voliers.add(new Volier("Volier 3", false));
    }

    public static void fillStaffCollection(List<Staff> staff) {
        staff.add(new Staff("Staff Amanda"));
        staff.add(new Staff("Staff Eugen"));
        staff.add(new Staff("Staff Marco"));
    }

    public static void fillTrainingGroundCollection(List<TrainingGround> trainingGrounds) {
        trainingGrounds.add(new TrainingGround("huge training ground"));
        trainingGrounds.add(new TrainingGround("small training ground #1"));
        trainingGrounds.add(new TrainingGround("small training ground #2"));
    }
}