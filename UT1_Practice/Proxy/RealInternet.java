package Proxy;

public class RealInternet implements Internet {

    @Override
    public void gotowebsite(String url) {
        // TODO Auto-generated method stub
        System.out.println("Visited site" + url);
    }
    
}
