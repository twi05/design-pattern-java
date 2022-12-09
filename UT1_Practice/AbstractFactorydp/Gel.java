package AbstractFactorydp;
class Gel implements Pen {
	Tube t;
        Refill r;
        public Tube getTube(){
            Tube x=new Metal();
            System.out.println(x.gettube());
            return x;
	}
	public Refill getRefill(){
            Refill x=new Plastic();
            System.out.println(x.getRefill());
            return x;
	}
        public Pen createProduct(){
            this.t=getTube();
            this.r=getRefill();
            System.out.println("GELPen composed");
            return this;
        }
}