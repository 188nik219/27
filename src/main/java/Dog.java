import java.io.Serializable;

public class Dog implements Serializable {
    private int numberOfTM;

    public Dog(int numberOfTM) {
        this.numberOfTM = numberOfTM;
    }
    @Override
    public String toString() {
        return "Dog{" +
                "numberOfTM=" + numberOfTM +
                '}';
    }
}
