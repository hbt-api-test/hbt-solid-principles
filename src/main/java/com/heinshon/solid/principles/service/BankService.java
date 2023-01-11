package com.heinshon.solid.principles.service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BankService {


    public long deposit(long amount, String accountNumber){
        //depositos
        return 0;
    }

    public long withDraw(long amount, String accountNumber){
        //retiros
        return 0;
    }


    public void printPassbook(){
        //actualizar transacciones
    }


    public void getLoanInterestInfo(String loanType){
        if(loanType.equals("hogar")){
            //calcular intereses credito hogar
        }
        if(loanType.equals("libreInversion")){
            //calcular intereses de libre inversion
        }
        if(loanType.equals("carro")){
            //calcular intereses vehicular
        }
    }

    public void sendOTP(String medium){
        if(medium.equals("email")){
            //codigo para envio de email
            //JavaMailSenderAPI
        }
    }


}
