package FactoryExercicio;

import FactoryExercicio.Factory.EmailNotificationFactory;
import FactoryExercicio.Factory.PushNotificationFactory;
import FactoryExercicio.Factory.SmsNotificationFactory;
import FactoryExercicio.Service.NotificationService;

import javax.management.Notification;

public class FactoryMain {
    public static void main(String[] args) {

        String message = "Bem vindo ao sistema";
        NotificationService service = new NotificationService();

        service.sendNotification(new EmailNotificationFactory(), message);
        service.sendNotification(new SmsNotificationFactory(), message);
        service.sendNotification(new PushNotificationFactory(), message);
    }
}
