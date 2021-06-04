public class Dog {
    private String name;
    private int age;
    private boolean healthy, hungry, trained;
    private String state;

    public Dog() {
        setState();
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
        setState();
    }

    private void setState() {
        if (age < 2) {
            state = "Puppy";
        } else if (age > 2 && age < 8) {
            state = "Adult dog";
        } else if (age > 8) {
            state = "Old dog";
        }
    }

    public void eat() {
        switch (state) {
            case "Puppy":
                System.out.printf("\n%s  is eating puppy's food.", name);
                break;
            case "Adult dog":
                System.out.printf("\n%s is eating adult's dog food.", name);
                break;
            case "Old dog":
                System.out.printf("\n%s is eating old's dog food.", name);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + state);
        }
    }

    public void sleep(){
        System.out.printf("\n%s is sleeping.", name);
    }

}