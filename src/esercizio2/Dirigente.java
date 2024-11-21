package esercizio2;

import esercizio1.Dipartimento;

public class Dirigente extends Dipendete{
    public Dirigente(int matricolo, double stipendio, Dipartimento dipartimento) {
        super(matricolo, stipendio, dipartimento);
    }

    @Override
    public double calcolaStipendio() {
        return getStipendio() + 1000;
    }

    @Override
    public void checkIn() {
        System.out.println("Lui inizia alle 11:00");
    }
}
