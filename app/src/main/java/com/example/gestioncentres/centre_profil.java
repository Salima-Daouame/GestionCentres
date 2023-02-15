package com.example.gestioncentres;

public class centre_profil {
    int image;
    String nom;
    String data;
    String loc;

  // Constructor
    public centre_profil(int image, String nom, String desc, String loc) {
        this.image = image;
        this.nom = nom;
        this.data = desc;
        this.loc = loc;
    }

 //getters
    public int getImage() {
        return image;
    }

    public String getNom() {
        return nom;
    }

    public String getDesc() {
        return data;
    }

    public String getLoc() {
        return loc;
    }

    //setters
    public void setImage(int image) {
        this.image = image;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setDesc(String desc) {
        this.data = desc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }


}

