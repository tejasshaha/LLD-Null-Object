public class Main {
    public static void main(String[] args){
        Vehicle obj = VehicleFactory.getObject("Car");
        obj.drive();
        System.out.println("Speed is:"+ obj.getSpeed());
        System.out.println("MPG is:" + obj.getMpg());
        System.out.println("**************");
        Vehicle obj1 = VehicleFactory.getObject("Bike");
        obj1.drive();
        System.out.println("Speed is:"+ obj1.getSpeed());
        System.out.println("MPG is:" + obj1.getMpg());
    }
}
