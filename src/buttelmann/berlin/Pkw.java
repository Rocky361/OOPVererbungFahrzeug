package buttelmann.berlin;

public class Pkw extends Fahrzeug {
    private int anzahlSitze;



    public Pkw(int anzahlSitze, int geschwindigkeit) {
        super(geschwindigkeit); // aufruf des Konstruktors der Oberklasse
        this.anzahlSitze = anzahlSitze;
        System.out.println("Konstruktor aus Pkw");
    }

    public int getAnzahlSitze() {
        return anzahlSitze;
    }

    public void setAnzahlSitze(int anzahlSitze) {
        this.anzahlSitze = anzahlSitze;
    }

    public void allesAusgeben(){
        System.out.println("Anzahl Sitze: " + anzahlSitze + "\nGeschwindigkeit: " + geschwindigkeit);
    }



}
