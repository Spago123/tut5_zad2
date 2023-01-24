package ba.unsa.etf.rpr;

public class SportsCar implements Car{
    @Override
    public String usage() {
        return "Sport";
    }

    @Override
    public void specification() {
        System.out.println("This car is a sports car");
    }
}
