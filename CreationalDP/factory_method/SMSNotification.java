public class SMSNotification implements Notification {

    @Override
    public void notifyUser(String type) {
        System.out.println(type);
    }
}
