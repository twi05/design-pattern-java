public class MusicPlayer {
    public static void main(String[] args) {
        Mediator serverMediator = new ServerMediator();
        Server s1 = new Server("s1", false);
        Server s2 = new Server("s2", false);
        serverMediator.addServer(s1);
        serverMediator.addServer(s2);
        serverMediator.findAvailableServer();
    }
}
