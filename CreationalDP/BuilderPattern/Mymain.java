package BuilderPattern;

public class Mymain {
    public static void main(String[] args) {
        Phone p;

        PhoneBuilder x = new PhoneBuilder();
       x.setOS("Windows").setRam(5);
         p= x.build();
        System.out.println(p);

    }
}