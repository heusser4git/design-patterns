package protection.proxy;

public interface Internet {
    Internet create();

    void connectTo(String target);
}
