package by.mnkqn.essences;

public class Staff {

    private String name;

    public Staff(String name) {
        this.name = name;
    }

    public void cleanVolier(Volier volier) {
        if (volier.isClean()) {
            System.out.println(volier.getName() + " is already clean.");
        } else {
            System.out.println(getName() + " cleans volier " + volier.getName());
            volier.setClean(true);
            System.out.println(volier.getName() + " is now clean");
        }
    }

    public String getName() {
        return name;
    }
}
