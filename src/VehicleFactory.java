public class VehicleFactory {

    public static Vehicle getObject(String obj){
        if(obj.equals("Car")){
            return new Car();
        }
        return new NullObject();
    }
}
