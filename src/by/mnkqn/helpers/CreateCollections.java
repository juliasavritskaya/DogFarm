package by.mnkqn.helpers;

import by.mnkqn.essences.*;
import java.util.List;

public class CreateCollections {
    public static void fillDogCollection(List<Dog> doges) {

        doges.add(new Dog("Stephen", 5));
        doges.add(new Dog("Lolly", 1));
        doges.add(new Dog("Artek", 9));
        doges.add(new Dog("Fluffy", 1));
        doges.add(new Dog("Conny", 7));
        doges.add(new Dog("Sasha", 4));

    }

    public static void fillVeterinaryCollection(List<Veterinary> vets) {
        vets.add(new Veterinary("Andrew"));
        vets.add(new Veterinary("Helena"));
        vets.add(new Veterinary("Marie"));
    }

    public static void fillVolierCollection(List<Volier> voliers) {
        voliers.add(new Volier("Volier 1", true));
        voliers.add(new Volier("Volier 2", false));
        voliers.add(new Volier("Volier 3", true));
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
