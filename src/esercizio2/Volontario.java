package esercizio2;

public class Volontario implements ICheck {

    private String nome;
    private int eta;
    private String cv;

    public Volontario(String nome, int eta, String cv) {
        this.nome = nome;
        this.eta = eta;
        this.cv = cv;
    }


    @Override
    public void checkIn() {
        System.out.println("lui inizia alle 7:00");
    }
}
