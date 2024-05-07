import java.util.concurrent.ThreadLocalRandom;

public class Die {
    private int numSides;
    private int value;

    public Die() {
        this.numSides = 6;
        this.value = 1;
    }

    public Die(int numSides) {
        this.numSides = numSides;
        this.value = 1;
        roll(numSides);
    }

    public int getNumSides() {
        return this.numSides;
    }

    public void setNumSides(int numSides) {
        this.numSides = numSides;
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "rolled a " + getValue()
                + " on a "
                + getNumSides() + " sided die";
    }

    public Integer roll(int numSides) {
        this.value = ThreadLocalRandom.current().nextInt(1, numSides);
        return value;
    }

}
