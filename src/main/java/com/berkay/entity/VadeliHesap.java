package com.berkay.entity;

public class VadeliHesap extends Hesap{
    private int vadeGun;


    public VadeliHesap(String hesapSahibi, String hesapNumarasi, double bakiye) {
        super(hesapSahibi, hesapNumarasi, bakiye);
        this.vadeGun = 30;     // 30 gün sabit bir vade belirledim.
    }
}
