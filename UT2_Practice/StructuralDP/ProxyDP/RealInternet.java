package UT2_Practice.StructuralDP.ProxyDP;

public class RealInternet implements Internet {
    @Override
    public void connectTo(String siteName) throws Exception {
        System.out.println("Connected to " + siteName);
    }
}
