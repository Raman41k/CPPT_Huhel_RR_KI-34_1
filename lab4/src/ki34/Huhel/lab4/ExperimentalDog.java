package ki34.Huhel.lab4;

public class ExperimentalDog extends Dog implements Bite
{
    /**
     * Constructor
     *
     * @param head
     * @param body
     * @param frontRightLeg
     * @param backRightLeg
     * @param frontLeftLeg
     * @param backLeftLeg
     * @param name
     * @param breed
     */
    public ExperimentalDog(Head head
            , Body body
            , Leg frontRightLeg
            , Leg backRightLeg
            , Leg frontLeftLeg
            , Leg backLeftLeg
            , String name
            , String breed)
    {
        super(head, body, frontRightLeg, backRightLeg, frontLeftLeg, backLeftLeg, name, breed);
        logger.log(logger.infoFlag + "ExperimentalDog constructor called");
    }

    @Override
    public void ToBite(String str) {
        System.out.println("Experimental dog bite " + str);
    }

    @Override
    public void Respond() {
        System.out.println("I am experimental dog. My name is " + name + " and my breed is " + breed);
        Bark();
        logger.log(logger.infoFlag + "ExperimentalDog Respond method was called");
    }

    @Override
    public void Bark() {
        System.out.println("Gav-gav-gav rafff-rafff-raffff");
        logger.log(logger.infoFlag + "ExperimentalDog bark method was called");
    }

    @Override
    public String toString() {
        return "ExperimentalDog: \n" +
                "name='" + name + '\'' + "\n" +
                "breed='" + breed + '\'' + "\n" +
                "head=" + head + "\n" +
                "body=" + body + "\n" +
                "frontRightLeg=" + frontRightLeg + "\n" +
                "backRightLeg=" + backRightLeg + "\n" +
                "frontLeftLeg=" + frontLeftLeg + "\n" +
                "backLeftLeg=" + backLeftLeg +"\n";
    }
}
