package com.berkay.entity;

public class Hesap {
    private String hesapSahibi;
    private String hesapNumarasi;
    private double bakiye;

    public String getHesapSahibi() {
        return hesapSahibi;
    }

    public String getHesapNumarasi() {
        return hesapNumarasi;
    }

    public double getBakiye() {
        return bakiye;
    }

    public Hesap(String hesapSahibi, String hesapNumarasi, double bakiye) {
        this.hesapSahibi = hesapSahibi;
        this.hesapNumarasi = hesapNumarasi;
        this.bakiye = bakiye;
    }
    public void paraYatir(double miktar){
        bakiye +=miktar;
        System.out.println("Hesabiniza "+miktar+" TL para eklenmiştir.");
        System.out.println("Yeni hesap bakiyeniz ....: "+bakiye);
    }
    public void paraCek(double miktar){
        if(bakiye>=miktar) {
            bakiye -= miktar;
            System.out.println("Hesabinizdan " + miktar + " TL para cekilmistir.");
            System.out.println("Yeni hesap bakiyeniz ....: " + bakiye);
        }
        else System.err.println("Yetersiz bakiye. Islem gerceklestirilemedi.");

    }


}