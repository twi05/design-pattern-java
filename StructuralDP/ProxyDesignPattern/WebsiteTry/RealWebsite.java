package ProxyDesignPattern.WebsiteTry;

public class RealWebsite implements Website{

    private String username, password, url;

    

    public RealWebsite(String username, String password, String url) {
        this.username = username;
        this.password = password;
        this.url = url;
        load();
    }

    void load(){
        System.out.println("Page loaded" + url);
        
        

    }


    

    @Override
    public void displayPage() {
        // TODO Auto-generated method stub
        System.out.println("Page displayed" + url);
    }
    
}
