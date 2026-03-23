package FactoryExercicio.Service;

import FactoryExercicio.Factory.NotificationFactory;
import FactoryExercicio.Factory.SmsNotificationFactory;
import FactoryExercicio.Notification.INotification;

public class NotificationService {

    public void sendNotification(NotificationFactory factory, String message) {

        INotification notification = factory.createNotification();
        notification.sendNotification(message);
    }
}
