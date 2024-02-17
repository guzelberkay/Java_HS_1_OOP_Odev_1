package com.berkay;

import com.berkay.entity.Banka;
import com.berkay.entity.Hesap;

/**
 * 1-A)Banka sınıfımız olsun banka sınıfını soyutlayalım özellikler ve metotlar ekleyelim
 * B)Hesap sınıfımız olsun bu hesap sınıfını soyutlayalım
 * C) Vadeli,Vadesiz Hesap sınıflarımız olsunbu sınıflarıda soyutlayarak gerekli özellik
 * ve metotlar ekleyebilirsinizUygulamadaki sınıflar arasında ilişkiler kurarak bu yapıyı oluşturmanızıistiyorum
 * ve Test sınıfında denemelerle bu yapıya ait nesneler oluşturmanızıistiyorum
 */
public class Runner {
    public static void main(String[] args) {
        Banka banka = new Banka("BERKBANK","Istanbul 34");
        Hesap vadeliHesap = banka.hesapAc("Vadeli","Berkay","123456789",80_000);

    }
}
