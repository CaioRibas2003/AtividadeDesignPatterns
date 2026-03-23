package FactoryExercicio.Factory;

import FactoryExercicio.Notification.INotification;
import FactoryExercicio.Notification.PushINotification;
import FactoryExercicio.Notification.SmsINotification;

public class PushNotificationFactory extends NotificationFactory {

    @Override
    public INotification createNotification() {
        return new PushINotification();
    }
}
