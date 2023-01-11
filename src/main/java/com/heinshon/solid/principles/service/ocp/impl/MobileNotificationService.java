package com.heinshon.solid.principles.service.ocp.impl;

import com.heinshon.solid.principles.service.ocp.INotificationService;

public class MobileNotificationService implements INotificationService {
    @Override
    public void sendOTP(String medium) {
        //Logica para envio de mensajes
        //Utilizando twilio api
    }

    @Override
    public void sendTransactionReport(String medium) {
        //Logica para envio de mensajes
        //Utilizando twilio api
    }
}
