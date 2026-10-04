package com.iim.project.model;

import jakarta.persistence.*;

@Entity
@Table(name = "anisse")
public class Anisse implements Combattant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom = "Anisse";
    private int taille;
    private int force;
    private int precision;

    public Anisse() {
    }

    public Anisse(int taille, int force, int precision) {
        this.taille = taille;
        this.force = force;
        this.precision = precision;
    }

    @Override
    public int frapper() {
        int puissance = (int) (Math.random() * 951);
        int score = puissance * force / 100;

        int chance = (int) (Math.random() * 100) + 1;

        if (chance > precision) {
            score = score / 2;
        }

        return score;
    }

    @Override
    public void afficherCaracteristiques() {
        System.out.println("ID : " + id);
        System.out.println("Nom : " + nom);
        System.out.println("Taille : " + taille);
        System.out.println("Force : " + force);
        System.out.println("Precision : " + precision);
    }

    public Long getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public int getTaille() {
        return taille;
    }

    public int getForce() {
        return force;
    }

    public int getPrecision() {
        return precision;
    }
}