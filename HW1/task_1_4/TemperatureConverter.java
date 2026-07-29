package task_1_4;

import java.util.Random;

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
        Random random = new Random();
        double temperatureCelsius = 1 + random.nextInt(250);

        boolean isAboveBoiling = temperatureCelsius > BOILING_POINT_CELSIUS;

        System.out.println("Самая низкая температура во Вселенной: " + ABSOLUTE_ZERO_CELSIUS + " °C");
        System.out.println("Текущая температура: " + temperatureCelsius + " °C");
        System.out.println("Выше точки кипения воды? " + isAboveBoiling);

        double temperatureFahrenheit = celsiusToFahrenheit(temperatureCelsius);
        System.out.println("Температура в Фаренгейтах: " + temperatureFahrenheit + " °F");

        System.out.println("Перевод обратно в Цельсии: " + fahrenheitToCelsius(temperatureFahrenheit) + " °C");
    }
}
