package ki34.Huhel.lab7;

public class Food implements Item
{
    private double volume;
    private String typeOfFood;

    public Food(double volume, String typeOfFood)
    {
        this.volume = volume;
        this.typeOfFood = typeOfFood;
    }

    public void setVolume(double volume)
    {
        this.volume = volume;
    }

    public String getTypeOfFood()
    {
        return typeOfFood;
    }

    public void setTypeOfFood(String typeOfFood)
    {
        this.typeOfFood = typeOfFood;
    }

    @Override
    public double getVolume()
    {
        return volume;
    }

    @Override
    public void PrintInfo()
    {
        System.out.println("Food: volume - " + volume + "; type of food - " + typeOfFood);
    }
}
