package Singleton;

public class Mymain {
    public static void main(String[] args) {
        Singleton.getInstance("asdf");

        Singleton.getInstance("qwer");
        Singleton.getInstance("");
        Singleton.getInstance("yuio");
    }
}
