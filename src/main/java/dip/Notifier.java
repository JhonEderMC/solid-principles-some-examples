package main.java.dip;

public class Notifier {

    private final NotificationService notificationService;

    public Notifier(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void sendNotifie(String messsage) {
        this.notificationService.send(messsage);
    }
}
