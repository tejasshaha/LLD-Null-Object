public class Car implements Vehicle{

    int speed;
    int mpg;

    public int getSpeed() {
        return 10;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getMpg() {
        return 5;
    }

    public void setMpg(int mpg) {
        this.mpg = mpg;
    }

    @Override
    public void drive() {
        System.out.println("I'm driving Car");
    }
}
