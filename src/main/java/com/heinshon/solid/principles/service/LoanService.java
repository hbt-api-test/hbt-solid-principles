package com.heinshon.solid.principles.service;

public class LoanService {

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

}
