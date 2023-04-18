package sg.edu.nus.iss;

public class MountainBike extends bicycle {
    
    public int seatHeight;

    public MountainBike(int seatHeight) {
        this.seatHeight = seatHeight;
    }
    //input seatHight will be assigned as class level seatHeight. What happens if there are 2 mountainbikes instantiated? 
    //Which one will be assigned as class level seatHeight?

    public MountainBike(int gear, int speed, int seatHeight) {
        super(gear, speed);
        this.seatHeight = seatHeight;
    }

    public int getSeatHeight() {
        return seatHeight;
    }

    public void setSeatHeight(int seatHeight) {
        this.seatHeight = seatHeight;
    }

    @Override
    public String toString() {
        // return "MountainBike [seatHeight=" + seatHeight + "]";
        return super.toString() + "\nSeat Height: " + seatHeight;
    }

    
}
