package esercizio2;

import esercizio1.Dipartimento;

public abstract class Dipendete implements ICheck {
    private int matricolo;
    private double stipendio;
    private Dipartimento dipartimento;

    public Dipendete(int matricolo, double stipendio, Dipartimento dipartimento) {
        this.matricolo = matricolo;
        this.stipendio = stipendio;
        this.dipartimento = dipartimento;
    }

    public int getMatricolo() {
        return matricolo;
    }

    public double getStipendio() {
        return stipendio;
    }

    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }



    public double calcolaStipendio () {
        return  0;
    };
}
