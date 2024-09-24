import java.util.ArrayList;

class room_selection
{
    private static final ArrayList<Integer> room_count = new ArrayList<>();


    public room_selection (int[] n){
        for (int i : n)
        {
            room_count.add(i);
        }
    }

    void getRoom_count()
    {
        for (int n :room_count)
        {
            System.out.printf("%d ", n);
        }
        System.out.println("\n");
    }

    void remove_selected_room_no(int selected_room)
    {
        int index = room_count.indexOf(selected_room);
        room_count.remove(index);
    }

    boolean check_room_availability()
    {
        if (room_count.isEmpty())
        {
            System.out.print("Sorry, Rooms are not available currently...");
            return true;
        }
        return false;
    }



}