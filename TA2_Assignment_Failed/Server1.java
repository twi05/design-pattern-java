public class Server1 implements ServerMediator{
    

    private Music music;
    private ServerI server;
    public boolean available;

 @Override
    public void registerServer(ServerI s) {
        this.server = s;
    }  

    @Override
    public void registerMusic(Music m) {
        
    }

    @Override
    public boolean isServerAvailable() {
        return available;
    }

    @Override
    public void setAvailabilityStatus(boolean status) {
        this.available = status;
    }
   
}
