package sg.edu.nus.iss;

public class bicycle {
    private int gear;
    private int speed;

    //Right click - Source Action - IDE-generated constructors/getters/setters
    public bicycle() {
    }

    public bicycle(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    public int getGear() {
        return gear;
    }
    public void setGear(int gear) {
        this.gear = gear;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void brake(int value) {
        speed -= value;
    }
    public void speedUp(int value) {
        speed += value;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + gear;
        result = prime * result + speed;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        bicycle other = (bicycle) obj;
        if (gear != other.gear)
            return false;
        if (speed != other.speed)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "bicycle [gear=" + gear + ", speed=" + speed + "]";
    }
    
    //hashcode helps with managing and retrieving info when there is a big list of bicycles.
    //toString method to customize and decide how the stored info will be presented.

    
}
