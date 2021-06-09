package by.mnkqn.essences;

public class Staff {

    private String name;

    public Staff(String name) {
        this.name = name;
    }

    public void cleanVolier(Volier voiler) {
        System.out.println(getName() + " cleans volier " + voiler.getName());
        voiler.setClean(true);
        System.out.println(voiler.getName() + " is now clean");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
