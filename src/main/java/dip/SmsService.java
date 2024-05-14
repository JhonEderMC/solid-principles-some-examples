package main.java.dip;

public class SmsService implements  NotificationService {
    @Override
    public void send(String message) {
        System.out.println("The sms was sent");
    }
}
