public class NotificationFactory implements Factory{


      public void createNotification(String s){
            
        if(s.equalsIgnoreCase("SMSNotification"))
        {
            // System.out.println("Drawn");
            SMSNotification a = new SMSNotification();
            a.notifyUser("You have SMS notification!");
            // return new SMSNotification();

        }


    }
    
}
