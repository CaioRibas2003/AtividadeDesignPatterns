package FactoryExercicio.Notification;

public class EmailINotification implements INotification {

@Override
    public void sendNotification(String message) {
        System.out.println("Email: " + message);
    }
}
