package sg.edu.nus.iss;

import java.util.ArrayList;
import java.util.List;

public class App 
{
    public static void main( String[] args )
    {
        MountainBike mb1 = new MountainBike(5, 10, 20);
        System.out.println(mb1.toString());

        MountainBike mb2 = new MountainBike(1, 2, 3);
        MountainBike mb3 = new MountainBike(4, 5, 6);

        List<MountainBike> bicycles = new ArrayList<MountainBike>();
        bicycles.add(mb1);
        bicycles.add(mb2);
        bicycles.add(mb3);

        for (int i = 0; i < bicycles.size(); i++) {
            System.out.println("Bike " + (i + 1) + ":" + bicycles.get(i).toString());
        }
    }
}
