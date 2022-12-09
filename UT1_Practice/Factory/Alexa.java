package Factory;

public class Alexa implements IDevice {

    
    public Alexa() {
        play();
    }

    @Override
    public void play() {
        System.out.println("Audio played by Alexa");        
    }
    
}
