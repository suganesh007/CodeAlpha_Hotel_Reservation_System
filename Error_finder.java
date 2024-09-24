import java.util.Scanner;

class find {
    public static String finder(String[] hotelsType_arr) {
        String place_input = "";
        boolean Valid = false;
        while (!Valid) {
            try {
                Scanner in = new Scanner(System.in);
                place_input = in.nextLine().toLowerCase();
                for (String s : hotelsType_arr) {
                    if (place_input.equals(s.toLowerCase())) {
                        Valid = true;
                    }
                }
                if (Valid)
                    System.out.println(place_input + " was selected");
                else
                    System.out.println("You Entered Wrong Name...");

            } catch (Exception ignored) {
                System.out.println("Type Error..");
            }
        }
        return place_input;
    }
}