import java.util.Locale;
import java.util.Scanner;
public class Exercise10 {
    public static void main(String[] args) {
        Scanner fahrenheit = new Scanner(System.in);
        System.out.print("Fahrenheit : ");
        double f = fahrenheit.nextDouble();

        double c = (f-32)*5/9;
        double k = (c + 273.15);
        System.out.print("\nCelsius : ");
        System.out.printf(Locale.US, "%,.2f" ,c);
        System.out.print("\nKelvin  : ");
        System.out.printf(Locale.US, "%,.2f",k);
    }
}
