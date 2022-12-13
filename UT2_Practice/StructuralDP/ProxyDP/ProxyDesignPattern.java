package UT2_Practice.StructuralDP.ProxyDP;

public class ProxyDesignPattern {
    public static void main(String[] args) {

        ProxyInternet pi = new ProxyInternet();
        try {
            pi.connectTo("s");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
