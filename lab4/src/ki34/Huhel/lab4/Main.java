package ki34.Huhel.lab4;

public class Main {
    public static void main(String[] args) {
        ExperimentalDog experimentalDog = new ExperimentalDog(new Head("gray")
                        , new Body("gray", "42")
                        , new Leg("gray", 32.1)
                        , new Leg("gray", 32.3)
                        , new Leg("gray", 31.8)
                        , new Leg("gray", 32.0)
                        , "Tuzik", "Sheepdog");

        experimentalDog.Bark();
        experimentalDog.Respond();
        System.out.println("\n\n" + experimentalDog);
    }
}