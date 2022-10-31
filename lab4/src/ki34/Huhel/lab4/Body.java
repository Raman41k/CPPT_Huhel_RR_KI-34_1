package ki34.Huhel.lab4;

/**
 * Class ki34.Huhel.lab4.Body
 * @author Roman
 * @version 1.0
 */
public class Body
{
    private String color;
    private String size;

    /**
     * Constructor
     * @param color
     * @param size
     */
    public Body(String color, String size) {
        this.color = color;
        this.size = size;
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
     * Getter for size
     * @return
     */
    public String getSize() {
        return size;
    }

    /**
     * Setter for size
     * @param size
     */
    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "ki34.Huhel.lab4.Body{ " +
                "color = '" + color + '\'' +
                ", size = '" + size + '\'' +
                '}';
    }
}
