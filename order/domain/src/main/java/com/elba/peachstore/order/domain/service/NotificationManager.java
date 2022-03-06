package com.elba.peachstore.order.domain.service;

import com.elba.peachstore.order.domain.aggregate.Notification;

public interface NotificationManager {

    public void sendTo(Notification notification);
}
