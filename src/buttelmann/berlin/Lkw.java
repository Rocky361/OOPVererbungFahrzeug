package buttelmann.berlin;

public class Lkw extends Fahrzeug {
    private int ladung;

    public Lkw(int geschwindigkeit, int ladung) {
        super(geschwindigkeit);
        this.ladung = ladung;
    }


    public int getLadung() {
        return ladung;
    }

    public void setLadung(int ladung) {
        this.ladung = ladung;
    }


}
