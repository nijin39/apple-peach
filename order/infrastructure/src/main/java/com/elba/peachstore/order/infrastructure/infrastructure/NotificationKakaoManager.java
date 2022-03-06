package com.elba.peachstore.order.infrastructure.infrastructure;

import com.elba.peachstore.order.domain.aggregate.Notification;
import com.elba.peachstore.order.domain.service.NotificationManager;

public class NotificationKakaoManager implements NotificationManager {

    @Override
    public void sendTo(Notification notification) {
        //TODO SendTO
        send(new kakaoNotificationDTO(notification));

    }
}
