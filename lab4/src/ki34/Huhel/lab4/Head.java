package ki34.Huhel.lab4;

/**
 * Class Head
 * @author Roman
 * @version 1.0
 */
public class Head
{
    private String color;

    /**
     * Constructor
     * @param color
     */
    public Head(String color) {
        this.color = color;
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

    @Override
    public String toString() {
        return "Head{ " +
                "color = '" + color + '\'' +
                '}';
    }
}
