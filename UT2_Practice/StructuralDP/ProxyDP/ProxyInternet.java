package UT2_Practice.StructuralDP.ProxyDP;

import java.util.ArrayList;

public class ProxyInternet implements Internet {
    private static ArrayList bannedSites;
    private Internet RealInternet;
    static {
        bannedSites = new ArrayList<String>();
        bannedSites.add("x");
        bannedSites.add("y");
        bannedSites.add("z");
        bannedSites.add("a");

    }

    @Override
    public void connectTo(String siteName) throws Exception {
        if (bannedSites.contains(siteName.toLowerCase())) {
            throw new Exception("Access Denied");
        }
        RealInternet = new RealInternet();
        RealInternet.connectTo(siteName);
    }

}
