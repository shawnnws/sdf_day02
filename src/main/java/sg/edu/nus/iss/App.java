package sg.edu.nus.iss;

import java.util.ArrayList;
import java.util.List;

public class App 
{
    public static void main( String[] args )
    {
        MountainBike mb1 = new MountainBike(5, 10, 20);
        MountainBike mb2 = new MountainBike(1, 2, 3);
        MountainBike mb3 = new MountainBike(4, 5, 6);

        RoadBike rb1 = new RoadBike(11, 22, 33);

        List<bicycle> bicycles = new ArrayList<bicycle>();
        bicycles.add(mb1);
        bicycles.add(mb2);
        bicycles.add(mb3);
        bicycles.add(rb1);

        for (bicycle bicycle : bicycles) {
            if (bicycle instanceof MountainBike) {
                System.out.println("Mountain bike: " + bicycle.toString());
            }
            else {
                System.out.println("Road bike: " + bicycle.toString());
            }
        }
        System.out.println(bicycles);
    }
}
