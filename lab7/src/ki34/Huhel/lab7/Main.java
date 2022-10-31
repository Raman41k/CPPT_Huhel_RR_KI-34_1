package ki34.Huhel.lab7;

public class Main
{
    public static void main(String[] args)
    {
        Packet<? super Item> packet = new Packet<>();

        packet.AddItem(new Clothes(345, "hoodie", "XL"));
        packet.AddItem(new Clothes(32, "T-Shirt", "S"));
        packet.AddItem(new Food(65, "bread"));
        packet.AddItem(new Food(400, "meat"));
        packet.AddItem(new Clothes(213, "hoodie", "M"));
        packet.AddItem(new Food(65, "Coce"));
        packet.AddItem(new Clothes(45, "hoodie", "L"));

        var max=  packet.FindMax();
        System.out.print("\nMax element is: ");
        max.PrintInfo();
    }
}