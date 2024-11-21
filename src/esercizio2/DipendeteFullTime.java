package esercizio2;

import esercizio1.Dipartimento;

public class DipendeteFullTime extends Dipendete{

    public DipendeteFullTime(int matricolo, double stipendio, Dipartimento dipartimento) {
        super(matricolo, stipendio, dipartimento);
    }

    @Override
    public double calcolaStipendio() {
        return getStipendio() + 100;
    }

    @Override
    public void checkIn() {
        System.out.println("Lui inizia alle 10:00");
    }
}
