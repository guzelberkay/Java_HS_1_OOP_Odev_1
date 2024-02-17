package com.berkay.entity;

public class Banka {
    private String bankaAdi;
    private String subeAdi;

    public Banka(String bankaAdi, String subeAdi) {
        this.bankaAdi = bankaAdi;
        this.subeAdi = subeAdi;
    }

    public Hesap hesapAc(String hesapTuru, String hesapSahibi, String hesapNumarasi, double bakiye)
    {
        if (hesapTuru.equalsIgnoreCase("Vadeli")) {
            return new VadeliHesap(hesapSahibi, hesapNumarasi, bakiye);
        } else if (hesapTuru.equalsIgnoreCase("Vadesiz")) {
            return new VadesizHesap(hesapSahibi, hesapNumarasi, bakiye);
        } else {
            System.err.println("Gecersiz hesap turu...");
        }
        return null;
    }

    public String getBankaAdi() {
        return bankaAdi;
    }

    public String getSubeAdi() {
        return subeAdi;
    }
}
