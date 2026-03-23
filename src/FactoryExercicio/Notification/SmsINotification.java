package FactoryExercicio.Notification;

public class SmsINotification implements INotification {

    @Override
    public void sendNotification(String message) {
        System.out.println("SMS: " + message);
    }
}
