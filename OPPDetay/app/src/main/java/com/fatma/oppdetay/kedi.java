package com.fatma.oppdetay;

public class kedi implements Egitim{
    String isim;
    String gozRengi;
     String tuyRengi;
     public static String turIsmi="tekir";
    public kedi(){

    }
    public static  void konusKediStatic(){
        System.out.println("benim türüm"+turIsmi);
    }
    public void konusKedi(){
        System.out.println("benim adım"+this.isim+"türüm"+turIsmi);
    }
    public kedi(String isim, String gozRengi, String tuyRengi){
        this.isim=isim;
        this.gozRengi=gozRengi;
        this.tuyRengi=tuyRengi;
    }

    @Override
    public boolean egitimAl() {
        System.out.println("kediler eğitilemez");
        return false;
    }
}
