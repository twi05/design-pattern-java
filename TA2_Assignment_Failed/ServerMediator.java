public interface ServerMediator {
    public void registerServer(ServerI s);
    public void registerMusic(Music m);
    public boolean isServerAvailable();
    public void setMusicStatus(boolean status);


}
