package task_1_4;

public class TemperatureConverter {

    public static final double ABSOLUTE_ZERO_CELSIUS = -273.15;
    public static final double BOILING_POINT_CELSIUS = 100.0;

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 1.8) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) / 1.8;
    }

    public static void main(String[] args) {
        double currentTemperature = 101;
        boolean isAboveBoiling = currentTemperature > BOILING_POINT_CELSIUS;

        System.out.println("Температура: " + currentTemperature + " C");
        System.out.println("Выше точки кипения? " + isAboveBoiling);
        System.out.println("В Фаренгейтах: " + celsiusToFahrenheit(currentTemperature));
    }
}