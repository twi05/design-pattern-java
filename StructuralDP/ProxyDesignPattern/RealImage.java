package ProxyDesignPattern;

public class RealImage implements Image {
    String filename;

    public RealImage(String filename) {
        this.filename = filename;
        load();
    }

    @Override
    public void display() {
        System.out.println("File displayed");
    }

    void load(){
        System.out.println("Loading" + filename);
    }
}
