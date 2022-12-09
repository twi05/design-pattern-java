package Factory;

public class MyMain {
    public static void main(String[] args) {
        DeviceFactory f = new DeviceFactory();
        f.create("ipod");
    }

}
