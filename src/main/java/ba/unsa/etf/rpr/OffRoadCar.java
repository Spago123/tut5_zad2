package ba.unsa.etf.rpr;

public class OffRoadCar implements Car{
    @Override
    public String usage() {
        return "Off Road";
    }

    @Override
    public void specification() {
        System.out.println("This car is an Off Road Car");
    }
}
