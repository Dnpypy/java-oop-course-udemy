package academy.devonline.java.section001_classes.constructor;

public class Class {

    private int value;

    public Class(int value) {
        this.value = value;
    }

    public void doSomething(int value) {
        value = 45;
        this.value = 67;
    }
}
