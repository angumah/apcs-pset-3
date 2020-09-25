import java.util.Locale;
import java.util.Scanner;
public class Exercise10 {
    public static void main(String[] args) {
        double f;
        Scanner fahrenheit = new Scanner(System.in);
        System.out.print("Fahrenheit : ");
        f = fahrenheit.nextDouble();

        double celsius = ((f-32)*(5/9));
        double kelvin = (celsius + 273.15);
        System.out.print("\nCelsius : ");
        System.out.printf(Locale.US, "%,.2f" ,celsius);
        System.out.print("\nKelvin  : ");
        System.out.printf(Locale.US, "%,.2f",kelvin);
    }
}
