package Factory;

public class Ipod implements IDevice {

    public Ipod(){
        play();
    }
    @Override
    public void play() {
        System.out.println("Audio played by Ipod");        
    }
    
}
