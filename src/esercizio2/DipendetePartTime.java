package esercizio2;

import esercizio1.Dipartimento;

public class DipendetePartTime extends Dipendete{
    public DipendetePartTime(int matricolo, double stipendio, Dipartimento dipartimento) {
        super(matricolo, stipendio, dipartimento);
    }

    @Override
    public double calcolaStipendio() {
        return getStipendio() + 50;
    }

    @Override
    public void checkIn() {
        System.out.println("Lui inizia alle 9:00");
    }
}
