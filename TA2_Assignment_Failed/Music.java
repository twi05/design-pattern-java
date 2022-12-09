public class Music implements MusicAction {
    private ServerMediator server;

    public Music(ServerMediator s) {
        this.server = s;
    }



    @Override
    public void play() {
        if(server.isServerAvailable()==true)
        {

        }
    }

    @Override
    public void pause() {

    }

}
