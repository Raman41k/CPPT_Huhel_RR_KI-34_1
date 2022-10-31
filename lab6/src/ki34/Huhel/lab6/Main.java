package ki34.Huhel.lab6;

public class Main
{
    public static void main(String[] args)
    {
        Calculator calculation = new Calculator();

        double result = calculation.Calc(3);
        String fileNameTXT = "1.txt";
        String fileNameBIN = "1.bin";

        WRResults.WriteInTXT(fileNameTXT, result);
        WRResults.WriteInBIN(fileNameBIN, result);

        System.out.println("Result from TXT file: " + WRResults.ReadFromTXT(fileNameTXT));
        System.out.println("Result from BIN file: " + WRResults.ReadFromBIN(fileNameBIN));
    }
}