package PrototypeDesign;

public class MyMain {

    public static void main(String[] args) {
        
        Prototype p1 = new Chess("Twinshu", 8);
        Chess e2 = (Chess) p1.getClone();
        e2.showRecord();

       
    }
}
