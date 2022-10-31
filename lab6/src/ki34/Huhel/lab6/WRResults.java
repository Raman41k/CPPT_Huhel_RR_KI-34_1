package ki34.Huhel.lab6;

import java.io.*;
import java.util.Scanner;

/**
 * Class WRResults. Was made to write results of calculation operations
 * @author Roman
 * @version 1.0
 */
public class WRResults
{
    /**
     * Static method WriteInTXT
     * @param fileName
     * @param result
     */
    public static void WriteInTXT(String fileName, double result)
    {
        FileWriter fileWriter = null;

        try
        {
            fileWriter = new FileWriter(fileName);
            fileWriter.write(String.valueOf(result));
        }
        catch (FileNotFoundException ex)
        {
            System.out.println(ex.getMessage());
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            try
            {
                fileWriter.close();
            }
            catch (IOException e)
            {
                System.out.println(e.getMessage());
            }
        }
    }

    /**
     * Static method ReadFromTXT
     * @param fileName
     * @return
     */
    public static double ReadFromTXT(String fileName)
    {
        double result = 0;
        File file = new File(fileName);
        Scanner scanner = null;
        try
        {
            if (!file.exists())  throw new FileNotFoundException("Can not find file " + fileName );
            scanner = new Scanner(file);
            result = Double.parseDouble(scanner.nextLine());
        }
        catch (FileNotFoundException ex)
        {
            System.out.println(ex.getMessage());
        }
        finally
        {
            scanner.close();
        }
        return result;
    }


    /**
     * Static method WriteInBIN
     * @param fileName
     * @param result
     */
    public static void WriteInBIN(String fileName, double result)
    {
        FileOutputStream fileOutputStream = null;
        DataOutputStream dataOutputStream = null;
        try
        {
            fileOutputStream = new FileOutputStream(fileName);
            dataOutputStream = new DataOutputStream(fileOutputStream);

            dataOutputStream.writeDouble(result);
        }
        catch (FileNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            try
            {
                dataOutputStream.close();
            }
            catch (IOException e)
            {
                System.out.println(e.getMessage());
            }
        }
    }

    /**
     * Static method ReadFromBIN
     * @param fileName
     * @return
     */
    public static double ReadFromBIN(String fileName)
    {
        double result = 0;
        FileInputStream fileInputStream = null;
        DataInputStream dataInputStream = null;

        try
        {
            fileInputStream = new FileInputStream(fileName);
            dataInputStream = new DataInputStream(fileInputStream);

            result = dataInputStream.readDouble();
        }
        catch (FileNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
        return result;
    }
}
