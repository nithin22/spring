package entity;

public class Airtel implements sim{
    @Override
    public void calling() {
        System.out.println("Airtel Calling");
    }

    @Override
    public void data() {
        System.out.println("Airtel Data");
    }
}
