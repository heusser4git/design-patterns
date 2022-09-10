package protection.proxy;

public final class InternetConnection {
    private InternetConnection() {
    }

    static Internet create() {
        return new RestrictedInternet();
    }
}
