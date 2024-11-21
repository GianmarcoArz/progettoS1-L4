import esercizio1.Dipartimento;
import esercizio2.*;


public static void main(String[] args) {
/*  Dipendete dipendete1 = new Dipendete(100,1000,Dipartimento.AMMINISTRAZIONE);
    Dipendete dipendete2 = new Dipendete(200,3000,Dipartimento.PRODUZIONE);
    Dipendete dipendete3 = new Dipendete(300,4000,Dipartimento.VEDNITE);

    Dipendete[] dipendete = new Dipendete[3];
    dipendete[0]=dipendete1;
    dipendete[1]=dipendete2;
    dipendete[2]=dipendete3;

    for (int i = 0; i < dipendete.length; i++) {

        Dipendete current = dipendete[i];
        System.out.println("la matricola e' :" + current.getMatricolo() );

    }*/

    esercizio2.Dipendete dipendete1 = new DipendeteFullTime(100,1000,Dipartimento.AMMINISTRAZIONE);
    esercizio2.Dipendete dipendete2 = new DipendetePartTime(200,3000,Dipartimento.PRODUZIONE);
    esercizio2.Dipendete dipendete3 = new Dirigente(300,4000,Dipartimento.VEDNITE);

    esercizio2.Dipendete[] dipendete = new esercizio2.Dipendete[3];
    dipendete[0]=dipendete1;
    dipendete[1]=dipendete2;
    dipendete[2]=dipendete3;

    for (int i = 0; i < dipendete.length; i++) {

        Dipendete current = dipendete[i];
        System.out.println("la matricola guadagna :" + current.calcolaStipendio() );

    }


    Volontario volontario1 = new Volontario("jack",102,"pessimo");

    ICheck[] arrayOre = new ICheck[4];
    arrayOre[0]=dipendete1;
    arrayOre[1]=dipendete2;
    arrayOre[2]=dipendete3;
    arrayOre[3]=volontario1;

    for (int i = 0; i < arrayOre.length; i++) {

        ICheck current = arrayOre[i];
       current.checkIn();
    }
}


