public class KilometerToMiles {
    public static void main(String[] args) {
        int km;
        double mi;

        km = 6;

        // conversion: mi / 0.621371 = km
        mi = km * 0.621371;

        // String.format("%.4f", mi)--> Double to 4 decimal places
        System.out.println(km + " km is equal: " + String.format("%.4f", mi));
    }

}