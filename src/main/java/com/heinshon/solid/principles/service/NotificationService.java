package com.heinshon.solid.principles.service;

public class NotificationService {

    public void sendOTP(String medium){
        if(medium.equals("email")){
            //codigo para envio de email
            //JavaMailSenderAPI
        }
        if(medium.equals("mobile")){
            //codigo para enviar mensajes
            //Implementar Twilio API
        }
    }

}
