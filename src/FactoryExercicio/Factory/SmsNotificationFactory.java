package FactoryExercicio.Factory;

import FactoryExercicio.Notification.INotification;
import FactoryExercicio.Notification.SmsINotification;

public class SmsNotificationFactory extends NotificationFactory {

    @Override
    public INotification createNotification() {
            return new SmsINotification();
    }
}
