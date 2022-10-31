package ki34.Huhel.lab4;

/**
 * Class leg
 * @author Roman
 * @version 1.0
 */
public class Leg
{
    private String color;
    private double length;

    /**
     * Constructor
     * @param color
     * @param length
     */
    public Leg(String color, double length) {
        this.color = color;
        this.length = length;
    }

    /**
     * Getter for color
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     * Setter for color
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Getter for length
     * @return length
     */
    public double getLength() {
        return length;
    }

    /**
     * Setter for length
     * @param length
     */
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Leg{ " +
                "color = '" + color + '\'' +
                ", length = " + length +
                '}';
    }
}
