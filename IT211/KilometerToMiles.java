import java.text.MessageFormat;
import java.util.Scanner;

class KilometerToMiles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the kilometers you want to convert: ");

        double km = input.nextDouble();

        double mi;

        // conversion: mi / 0.621371 = km
        mi = km * 0.621371;

        // String.format("%.4f", mi)--> Double to 4 decimal places
        System.out.println(km + " km is equal: " + String.format("%.4f", mi));
    }

}