package FactoryExercicio.Notification;

public class PushINotification implements INotification {

    @Override
    public void sendNotification (String message) {
        System.out.println("Push: " + message);
    }
}
