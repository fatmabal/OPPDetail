package com.fatma.oppdetay;

public class Kopek extends Hayvan implements Egitim {
    public Kopek(){

    }
    public Kopek(String isim,String gozRengi,String tuyRengi){
        super(isim,gozRengi, tuyRengi);
    }

    @Override
    public boolean egitimAl() {
        System.out.println("köpekler eğitilebilir");
        return true;
    }
}
