package Proxy;

public class MyMain {
    public static void main(String[] args) {
        try{
            Internet i =  new ProxyInternet("bang10.com");
            Internet j =  new ProxyInternet("bang10.com");
            Internet k =  new ProxyInternet("bang10.com");
            Internet l =  new ProxyInternet("bang10.com");
        }
        catch(Exception e)
        {
            System.out.println("Accesss Denied");
        }
       
    }
    
}
