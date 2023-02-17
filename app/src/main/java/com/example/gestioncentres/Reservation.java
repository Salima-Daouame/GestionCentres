package com.example.gestioncentres;

import android.widget.EditText;

import java.util.Date;

public class Reservation {

    String Name;
    String Email;
    String date_debut;
    String date_fin;
    String heur_debut;
    String heur_fin;
    String description;

 //   public Reservation(String name, String email, String datedebut, String datefin, String heuredebut, String heurefin, String description){}




     /public Reservation(String name, String email, String date_debut, String date_fin, String heur_debut, String heur_fin, String description) {
            Name = name;
            Email = email;
            this.date_debut = String.valueOf(date_debut);
            this.date_fin = String.valueOf(date_fin);
            this.heur_debut = heur_debut;
            this.heur_fin = heur_fin;
            this.description = description;

        }



    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getDate_debut() {
        return date_debut;
    }

    public void setDate_debut(String date_debut) {
        this.date_debut = date_debut;
    }

    public String getDate_fin() {
        return date_fin;
    }

    public void setDate_fin(String date_fin) {
        this.date_fin = date_fin;
    }

    public String getHeur_debut() {
        return heur_debut;
    }

    public void setHeur_debut(String heur_debut) {
        this.heur_debut = heur_debut;
    }

    public String getHeur_fin() {
        return heur_fin;
    }

    public void setHeur_fin(String heur_fin) {
        this.heur_fin = heur_fin;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

