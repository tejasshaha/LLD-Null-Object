public class NullObject implements Vehicle{

    int speed=0;
    int mpg=0;

    public int getSpeed() {
        return speed;
    }

    public int getMpg() {
        return mpg;
    }

    @Override
    public void drive() {
        System.out.println("Nothing to drive.Null object with default behavior");
    }
}
