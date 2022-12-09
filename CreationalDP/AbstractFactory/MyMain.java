package AbstractFactory;

public class MyMain {
    public static void main(String[] args) {

        PenFactory p = new GELPenFactory();
        p.createPen();

    }
}
