package ba.unsa.etf.rpr;

/**
 * Factory that produces cars
 */
public class CarFactory {
    public Car getInstance(String type){
        if(type.equals(new SportsCar().usage())){
            return new SportsCar();
        }else{
            return new OffRoadCar();
        }
    }
}
