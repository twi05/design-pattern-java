package AbstractFactory;

public class GELPenFactory implements PenFactory{

    @Override
    public void createTube() {
        Tube m = new Metal();
        System.out.println(m.getTube());
    }


@Override
public void createRefill() {
    Plastic p = new Plastic();
    System.out.println( p.getRefill());
}


@Override
public void createPen() {
    // TODO Auto-generated method stub
    createTube();
    createRefill();
}
    
}
