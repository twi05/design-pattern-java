package Singleton;

public  class Singleton {

  private  static Singleton s = null;
  private static volatile Object mutex  = new Object();

    private Singleton(String name) {
        System.out.println("Singleton class object intialized");
    }

    public static Singleton getInstance(String name) {
        if (s == null)
            s = new Singleton(name);
        return s;
    }

}
