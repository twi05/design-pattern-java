package CompositeDesignPattern;

public class Testmain {
    public static void main(String[] args) {
        Ram r = new Ram(4);
        Cpu c = new Cpu(3);
        Assembly ass = new Assembly();
        ass.add(r);
        ass.add(c);
        // ass.showcomponent();

        Ram r2 = new Ram(5);
        Cpu c2 = new Cpu(5);
        Assembly ass2 = new Assembly();
        ass2.add(r2);
        ass2.add(c2);

        Assembly ass3 = new Assembly();
        ass3.add(ass2);
        ass3.add(ass);
        ass3.showcomponent();
    
    }
}
