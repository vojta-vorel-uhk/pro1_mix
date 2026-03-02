package pro1;

import java.util.Arrays;

public class Tools4
{
    public static double maximumValue(Number[] numbers)
    {
        double max = 0;
        for(var n : numbers){
            var d = n.doubleValue();
            if(d>max)
                max=d;
        }
        return max;
    }
    public static double maximumValue2(Number[] numbers)
    {
        return Arrays
            .stream(numbers)
            .mapToDouble(Number::doubleValue)
            .max().getAsDouble();
    }
}
