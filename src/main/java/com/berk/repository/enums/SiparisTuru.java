package com.berk.repository.enums;

public enum SiparisTuru {
    KOLA(30D),AYRAN(25D),SODA(5D),MEYVE_SUYU(14D),GAZOZ(18D),FANTA(21D),UN(130D),
    SEKER(35D),MAKARNA(9D),CIKOLATA(6D),BULGUR(12D),
    PANTOLON(200D),GOMLEK(250D),MONT(1000D),HIRKA(200D),KEBAP(180D),PIDE(90D),MANTI(90D),
    HAMBURGER(140D),PIZZA(110D);

    private Double fiyat;

    SiparisTuru(Double fiyat){
        this.fiyat = fiyat;
    }
    public Double getFiyat() {
        return fiyat;
    }
}
