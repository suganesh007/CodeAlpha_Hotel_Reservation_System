import java.util.ArrayList;

class cities
{
//    private cities(){};
//    static cities obj;
//    static cities getInstance()
//    {
//        if (obj == null)
//        {
//            obj = new cities();
//        }
//        return obj;
//    }

     static ArrayList<String> Current_List = new ArrayList<>();

    // input for city names using varargs
    void ArrayValues (String... array_list)
    {
        for (String i : array_list)
        {
            Current_List.add(i);
        }
    }

    // printing all city names
    void print_all()
    {
        for (String n : Current_List)
        {
            System.out.println(n);
        }
    }

    void clearAll()
    {
        Current_List.clear();
    }


}




