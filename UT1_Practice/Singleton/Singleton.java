package Singleton;

public class Singleton {

    private static Item i = null;

    private Singleton() {

    }

    final static Item getItem() {
        if (i == null) {
            i = new Item();
        }

        return i;
    }
}
