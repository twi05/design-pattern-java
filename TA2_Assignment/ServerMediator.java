import java.util.ArrayList;

public class ServerMediator implements Mediator {

    private ArrayList<Server> servers;

    public ServerMediator() {
        servers = new ArrayList<Server>();
    }

    @Override
    public void addServer(Server s) {
        servers.add(s);
    }

    @Override
    public void findAvailableServer() {
        boolean foundfreeServer = false;
        for (Server s : servers) {
            if (s.isavailable()) {
                foundfreeServer = true;
                System.out.println("Server " + s.name + " is available.");
            }
        }
        if (foundfreeServer == false) {
            System.out.println("No Server is available. Download in not possible. Come again later!");
        }

    }

}
