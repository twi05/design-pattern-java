package ProxyDesignPattern.WebsiteTry;

public class ProxyWebsite implements Website {

    private RealWebsite r;
    private String url;
    private String username;
    private String password;
    
    



    public ProxyWebsite(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }



    @Override
    public void displayPage() {
        // TODO Auto-generated method stub
     if(r==null){
        r = new RealWebsite(this.username, this.password, url)
     }

        r.displayPage();
    }
    
}
