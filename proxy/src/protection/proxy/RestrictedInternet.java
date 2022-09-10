package protection.proxy;

import java.util.ArrayList;

public class RestrictedInternet implements Internet {
    private static ArrayList<String> forbiddenTargets = new ArrayList();
    private RealInternet realInternet;

    static {
        forbiddenTargets.add("abc.com"); //abc.com, def.com, ijk.com, lnm.com
        forbiddenTargets.add("def.com");
        forbiddenTargets.add("ijk.com");
        forbiddenTargets.add("lnm.com");
    }

    public RestrictedInternet() {
        realInternet = new RealInternet();
    }

    @Override
    public void connectTo(String target) {
        if(!forbiddenTargets.contains(target)) {
            realInternet.connectTo(target);
        }
    }
}
