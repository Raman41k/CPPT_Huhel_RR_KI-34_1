package ki34.Huhel.lab4;

/**
 * Class Dog
 * @author Roman
 * @version 1.0
 */
public abstract class Dog
{
    protected Head head;
    protected Body body;
    protected Leg frontRightLeg;
    protected Leg backRightLeg;
    protected Leg frontLeftLeg;
    protected Leg backLeftLeg;
    protected String name;
    protected String breed;
    protected Logger logger = Logger.getLogger("logs.txt");

    /**
     * Constructor
     * @param head
     * @param body
     * @param frontRightLeg
     * @param backRightLeg
     * @param frontLeftLeg
     * @param backLeftLeg
     * @param name
     * @param breed
     */
    public Dog(Head head, Body body,
               Leg frontRightLeg, Leg backRightLeg,
               Leg frontLeftLeg, Leg backLeftLeg,
               String name, String breed) {
        this.head = head;
        this.body = body;
        this.frontRightLeg = frontRightLeg;
        this.backRightLeg = backRightLeg;
        this.frontLeftLeg = frontLeftLeg;
        this.backLeftLeg = backLeftLeg;
        this.name = name;
        this.breed = breed;
        logger.log(logger.infoFlag + "Dog constructor called");
    }

    /**
     * Method Respond
     */
    public abstract void Respond();

    /**
     * Method Bark
     */
    public abstract void Bark();

    @Override
    public String toString() {
        return "Dog: \n" +
                "name = '" + name + '\'' + "\n" +
                "breed = '" + breed + '\'' + "\n" +
                "head = " + head + "\n" +
                "body = " + body +  "\n" +
                "frontRightLeg = " + frontRightLeg +  "\n" +
                "backRightLeg = " + backRightLeg +  "\n" +
                "frontLeftLeg = " + frontLeftLeg +  "\n" +
                "backLeftLeg = " + backLeftLeg;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public Leg getFrontRightLeg() {
        return frontRightLeg;
    }

    public void setFrontRightLeg(Leg frontRightLeg) {
        this.frontRightLeg = frontRightLeg;
    }

    public Leg getBackRightLeg() {
        return backRightLeg;
    }

    public void setBackRightLeg(Leg backRightLeg) {
        this.backRightLeg = backRightLeg;
    }

    public Leg getFrontLeftLeg() {
        return frontLeftLeg;
    }

    public void setFrontLeftLeg(Leg frontLeftLeg) {
        this.frontLeftLeg = frontLeftLeg;
    }

    public Leg getBackLeftLeg() {
        return backLeftLeg;
    }

    public void setBackLeftLeg(Leg backLeftLeg) {
        this.backLeftLeg = backLeftLeg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
