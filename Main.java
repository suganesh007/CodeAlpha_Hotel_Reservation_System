import java.util.Scanner;

public class Main{
    public static void main(String[] args)
    {
        System.out.print("\nWelcome to Hotel reservation Process !\nThe avail cities are....   \n");
        int[] room_block = {1,2,3,4,5};
        room_selection o2 = new room_selection(room_block);

        boolean Check = false;
        while(!Check) {
            // location type
            String[] arr = {"chennai", "delhi", "Mumbai", "Hyderabad", "Trichy", "Madurai", "Salem", "Perambalur",};
            cities o1 = new cities();
            o1.ArrayValues(arr);
            o1.print_all();
            System.out.print("\nEnter the city name = ");
            String input = find.finder(arr);
            o1.clearAll();


            // hotel type
            System.out.println("The Available Room Categories are...");
            String[] hotelsType_arr = {"HouseBoat", "Villa", "All Inclusive", "Apartment", "Resort", "spa", "Cabin", "Pool", "Family Friendly", "Pet Friendly"};
            o1.ArrayValues(hotelsType_arr);
            o1.print_all();
            System.out.print("Enter the Hotel type you want :");
            String op = find.finder(hotelsType_arr);
            o1.clearAll();


            // hotel selection
            System.out.print("\nSelect the Hotel to stay :");
            String[] hotels_avail = {"Marriott Hotels", "Hilton Hotels & Resorts", "Hyatt Hotels", "The Ritz-Carlton", "Taj Hotels", "Sheraton Hotels", "Holiday Inn", "Radisson Hotels", "Four Seasons Hotels", "ITC Hotels"};
            o1.ArrayValues(hotels_avail);
            o1.print_all();
            System.out.print("\nEnter the hotel name = ");
            String hotel_name = find.finder(hotels_avail);
            o1.clearAll();


            //  checking availability
            Check = o2.check_room_availability();
            if (Check)
                break;

            // room selection
            System.out.println("Available room numbers are (0 present for verification process...");
            o2.getRoom_count();
            System.out.println("Enter the room no :");
            Scanner in = new Scanner(System.in);
            int selected_room = in.nextInt();



            // removing selected rooms
            o2.remove_selected_room_no(selected_room);

            //deposit or reserve
            System.out.print("Make Deposit to Complete The Reservation Process (rs. 10,000) : ");
            boolean Valid = false;
            int payment = 0;
            while (!Valid) {
                try {
                    payment = in.nextInt();
                    if (payment == 10000) {
                        System.out.println("payment Successful...");
                        Valid = true;
                    } else {
                        System.out.println("You should Only pay rs.10,000");
                    }
                } catch (Exception ignored) {
                    System.out.println("Only Numbers are allowed...");
                    in.next();
                }
            }

            System.out.println("Enter the 1 to exit or any numbers to continue = ");
            int final_ending = in.nextInt();
            if (final_ending == 1) {
                Check = true;
                System.out.println("Thanks for Visiting");
            }

    }

















    }
}

