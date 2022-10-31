package ki34.Huhel.lab5;

/**
 * class Calculator
 * @author Roman
 * @version 1.0
 */
public class Calculator
{
    public double Calc(double x)
    {
        double y = 0;

        try
        {
            y = Math.sin(x) / Math.cos(x);
            if (y==Double.NEGATIVE_INFINITY || y==Double.POSITIVE_INFINITY)
            {
                throw new ArithmeticException();
            }
        }
        catch (ArithmeticException e)
        {
            if (Math.cos(x) == 0)
            {
                throw new ArithmeticException("Exception reason: cos(" + x + ") = 0");
            }
        }
        return y;
    }
}
