package com.heinshon.solid.principles.service.ocp.impl;

import com.heinshon.solid.principles.service.ocp.INotificationService;

public class EmailNotificationService implements INotificationService {

    @Override
    public void sendOTP(String medium) {
        //Logica para envio de mail
    }

    @Override
    public void sendTransactionReport(String medium) {
        //Logica para envio de mail
    }
}
