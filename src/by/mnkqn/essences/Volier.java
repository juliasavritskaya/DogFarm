package by.mnkqn.essences;

public class Volier {

    private String name;

    private boolean clean;

    public Volier(String name, boolean clean) {
        this.clean = clean;
        this.name = name;
    }

    public void setClean(boolean clean) {
        this.clean = clean;
    }

    public boolean isClean() {
        return clean;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}