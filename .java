import java.util.Scanner;

public class TemperatureConverter {

    public static double convertTemperature(double temperature, String unit){
        if (unit.equalsIgnoreCase("C")){
            return (temperature * 9.0 / 5.0) + 32;
        }
        else {
            return (temperature - 32) * 5.0 / 9.0;
        }
    }
}