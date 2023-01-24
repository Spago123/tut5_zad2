package ba.unsa.etf.rpr;

/**
 * Example of Factory Design Pattern
 * @author Harun Spago
 * @version 1.0.0
 */
public class App {
    public static void main( String[] args ) {
        CarFactory carFactory = new CarFactory();
        Car car1 = carFactory.getInstance("Sport");
        car1.specification();
        Car car2 = carFactory.getInstance("Off Road");
        car2.specification();
    }
}
