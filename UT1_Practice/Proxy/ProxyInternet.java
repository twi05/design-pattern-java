package Proxy;

import java.util.ArrayList;

public class ProxyInternet implements Internet {

    private RealInternet ri = null;
    private static ArrayList<String> bannedSite;

    static {
        bannedSite = new ArrayList<>();
        bannedSite.add("bang.com");
        bannedSite.add("bang1.com");
        bannedSite.add("bang2.com");
        bannedSite.add("bang3.com");
    }

    ProxyInternet(String url) throws Exception {

        if (bannedSite.contains(url)) {
            throw new Exception();
        }
        gotowebsite(url);
    }

    @Override
    public void gotowebsite(String url) {
        // TODO Auto-generated method stub
        if (ri == null) {
            ri = new RealInternet();
        }
        ri.gotowebsite(url);
    }
}
