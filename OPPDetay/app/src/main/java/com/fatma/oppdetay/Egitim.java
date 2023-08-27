package com.fatma.oppdetay;

public interface Egitim {
    public  boolean egitimAl();
    public default boolean egitimAlBody(){
        System.out.println("eeğitm almıyoruz");
        return false;

    }
}
