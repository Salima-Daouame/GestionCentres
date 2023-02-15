package com.example.gestioncentres;

public class Assouciations {

    String Nam;
    String Cod;
    String numTl;
    String eml;
    String adrs;
    String mp1;
    String cfmp1;
    //String image_url;

    public Assouciations(String nam, String cod, String numTl, String eml, String adrs, String mp1, String cfmp1) {
        Nam = nam;
        Cod = cod;
        this.numTl = numTl;
        this.eml = eml;
        this.adrs = adrs;
        this.mp1 = mp1;
        this.cfmp1 = cfmp1;
      //  this.image_url=image_url;
    }

    public String getNam() {
        return Nam;
    }

    public String getCod() {
        return Cod;
    }

    public String getNumTl() {
        return numTl;
    }

    public String getEml() {
        return eml;
    }

    public String getAdrs() {
        return adrs;
    }

    public String getMp1() {
        return mp1;
    }

    public String getCfmp1() {
        return cfmp1;
    }

    //public String getImage_url() {
      //  return image_url;

}
