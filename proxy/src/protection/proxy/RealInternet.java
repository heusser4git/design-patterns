package protection.proxy;

public class RealInternet implements Internet {
    public void connectTo(String address)  {
        System.out.println("Connecting to "+ address);
    }
}
