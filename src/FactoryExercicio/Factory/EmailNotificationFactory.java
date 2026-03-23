package FactoryExercicio.Factory;

import FactoryExercicio.Notification.EmailINotification;
import FactoryExercicio.Notification.INotification;

public class EmailNotificationFactory extends NotificationFactory {

    @Override
    public INotification createNotification() {
        return new EmailINotification();
    }
}
