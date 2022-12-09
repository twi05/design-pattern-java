package Factory;

public class DeviceFactory {
    
    IDevice i = null;
    
    public IDevice create(String s){
        if(s.equalsIgnoreCase("alexa")){
            i = new Alexa();
            return  i;
        }
        else if(s.equalsIgnoreCase("ipod")){
            i = new Ipod();
            return  i;
        }
       
        return null;
    }
}


