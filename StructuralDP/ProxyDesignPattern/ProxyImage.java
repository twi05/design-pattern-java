package ProxyDesignPattern;

public class ProxyImage implements Image {

    private RealImage r;
    private String filemame;

    public ProxyImage(String filemame) {
        this.filemame = filemame;

    }

    public void display() 
    {
        if (r == null) {
            r = new RealImage(filemame);
        }
        r.display();
    }
}
