package AbstractFactorydp;

class Sketch implements Pen {
    Tube t;
    Refill r;

    public Tube getTube() {
        Tube x = new Fibre();
        System.out.println(x.gettube());
        return x;
    }

    public Refill getRefill() {
        Refill x = new Sponge();
        System.out.println(x.getRefill());
        return x;
    }

    public Pen createProduct() {
        this.t = getTube();
        this.r = getRefill();
        System.out.println("SKETCHPen composed");
        return this;
    }
}
