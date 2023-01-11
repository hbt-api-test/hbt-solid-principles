package com.heinshon.solid.principles.service.ocp;

public interface INotificationService {

    void sendOTP(String medium);
    void sendTransactionReport(String medium);
}
