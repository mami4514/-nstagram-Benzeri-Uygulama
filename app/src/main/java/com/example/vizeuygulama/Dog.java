package com.example.vizeuygulama;

public class Dog {

    private int logo;
    private String tür,isim;

    public Dog(int logo, String tür, String isim) {
        this.logo = logo;
        this.tür = tür;
        this.isim = isim;
    }

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }

    public String getTür() {
        return tür;
    }

    public void setTür(String tür) {
        this.tür = tür;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
}
