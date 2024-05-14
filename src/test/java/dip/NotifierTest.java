package test.java.dip;

import main.java.dip.EmailService;
import main.java.dip.Notifier;
import main.java.dip.SmsService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;


class NotifierTest {

    @DisplayName("It must call the 'send' method when a notification email is sent")
    @Test
    public void sendEmailNotification(){
        //Arrange
        String message = "Hello email";
        EmailService emailService = Mockito.mock(EmailService.class);
        Notifier notifier = new Notifier(emailService);

        //Act
        notifier.sendNotifie(message);

        //Assert
        Mockito.verify(emailService, Mockito.times(1)).send(message);
        Mockito.verify(emailService).send(message);
    }

    @DisplayName("It must call the 'send' method when a notification Sms is sent")
    @Test
    public void sendSmsNotification() {
        //Arrange
        String sms = "Hello sms";
        SmsService smsService = Mockito.mock(SmsService.class);
        Notifier notifier = new Notifier(smsService);

        //Act
        notifier.sendNotifie(sms);

        //Assert
        Mockito.verify(smsService, Mockito.times(1)).send(sms);
        Mockito.verify(smsService).send(sms);

    }

}