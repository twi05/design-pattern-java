package CompositeDesignPattern;

public class Cpu implements Component {
    int gigs;

    public Cpu(int gigs) {
        this.gigs = gigs;
    }

    @Override
    public void showcomponent() {
        System.out.println("Cpu gigs: "+gigs);
    }
    
}
