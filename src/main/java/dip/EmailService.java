package main.java.dip;

public class EmailService implements  NotificationService {

    @Override
    public void send(String message) {
        System.out.println("The email was sent: "+ message);
    }
}
